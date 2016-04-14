package data;

import java.util.ArrayList;
import java.util.List;

public interface BioDAO {
	public ArrayList<Bio> getProfileByName(String name);
	public ArrayList<Bio> getProfileByAnimal(String animal);
	public ArrayList<Bio> getProfileBySign(String sign);
	public void addBio(Bio bio);
	public void editBio(Bio bio);

	List<Bio> getAllBios();
}
