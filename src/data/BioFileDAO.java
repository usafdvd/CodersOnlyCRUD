package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class BioFileDAO implements BioDAO {
	private static final String FILE_NAME = "/WEB-INF/personbio.csv";
	private List<Bio> bios = new ArrayList<>();

	@Autowired
	private ApplicationContext ac;

	@PostConstruct
	public void init() {
		try (InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split("& ");
				String id = tokens[0];
				String name = tokens[1];
				String like1 = tokens[2];
				String like2 = tokens[3];
				String like3 = tokens[4];
				String animal = tokens[5];
				String sign = tokens[6];
				String quote = tokens[7];
				String image = tokens[8];

				bios.add(new Bio(id, name, like1, like2, like3, animal, sign, quote, image));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public Bio editProfileById(String id) {
		Bio x = null;
		for (Bio bio : bios) {
			if (bio.getId().equalsIgnoreCase(id)) {
				x = bio;
			}
		}
		return x;
	}

	@Override
	public ArrayList<Bio> getProfileByName(String name) {
		ArrayList<Bio> nameArray = new ArrayList<Bio>();
		Bio x = null;
		for (Bio bio : bios) {
			if (bio.getName().equalsIgnoreCase(name)) {
				x = bio;
				nameArray.add(x);
			}
		}
		return nameArray;
	}

	@Override
	public ArrayList<Bio> getProfileByAnimal(String animal) {
		ArrayList<Bio> animalArray = new ArrayList<Bio>();
		Bio x = null;
		for (Bio bio : bios) {
			if (bio.getAnimal().equalsIgnoreCase(animal)) {
				x = bio;
				animalArray.add(x);
			}
		}
		return animalArray;
	}

	@Override
	public ArrayList<Bio> getProfileBySign(String sign) {
		ArrayList<Bio> signArray = new ArrayList<Bio>();
		Bio x = null;
		for (Bio bio : bios) {
			if (bio.getSign().equalsIgnoreCase(sign)) {
				x = bio;
				signArray.add(x);
			}
		}
		return signArray;
	}

	@Override
	public List<Bio> getAllBios() {
		return bios;
	}

	@Override
	public void addBio(Bio bio) {
		bios.add(bio);
	}

	@Override
	public List<Bio> deleteProfile(Bio bio) {
		Bio x = new Bio();
		for (Bio b : bios) {
			if (bio.getId().equals(b.getId())) {
				x = b;
				break;
			}
		}
		bios.remove(x);
		return bios;
	}

	@Override
	public List<Bio> updateProfileById(Bio bio) {
		Bio oldBio = new Bio();
		for (Bio b : bios) {
			if (bio.getId().equals(b.getId())) {
				oldBio = b;
			}
		}

		bios.set(bios.indexOf(oldBio), bio);
		return bios;
	}
}
