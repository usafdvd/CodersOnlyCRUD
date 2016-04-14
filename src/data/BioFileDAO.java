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
	private static final String FILE_NAME="/WEB-INF/personbio.csv";
	private List<Bio> bios = new ArrayList<>();
	
	@Autowired
	private ApplicationContext ac;
	
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the application context
		// rather than directly from the file system
		try (
				InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split("& ");
				String name = tokens[1];
				String like1 = tokens[2];
				String like2 = tokens[3];
				String like3 = tokens[4];
				String animal = tokens[5];
				String sign = tokens[6];
				String quote = tokens[7];
			
				bios.add(new Bio(name, like1, like2, like3, animal, sign, quote));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	@Override
	public Bio getProfileByName(String name) {
		Bio x = null;
		for (Bio bio: bios) {
			if (bio.getName().equalsIgnoreCase(name)) {
				x = bio;
				break;
			}
		}
		return x;
	}
	
	@Override
	public Bio getProfileByAnimal(String animal) {
		Bio x = null;
		for (Bio bio: bios) {
			if (bio.getAnimal().equalsIgnoreCase(animal)) {
				x = bio;
				break;
			}
		}
		return x;
	}
	
	@Override
	public Bio getProfileBySign(String sign) {
		Bio x = null;
		for (Bio bio: bios) {
			if (bio.getSign().equalsIgnoreCase(sign)) {
				x = bio;
				break;
			}
		}
		return x;
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
	public void editBio(Bio bio) {
		
	}
	

	
	
}
