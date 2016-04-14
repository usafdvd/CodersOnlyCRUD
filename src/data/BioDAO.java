package data;

import java.util.List;

public interface BioDAO {
	public Bio getProfileByName(String name);
	public Bio getProfileByAnimal(String animal);
	public Bio getProfileBySign(String sign);
	public void addBio(Bio bio);
	public void editBio(Bio bio);
	List<Bio> getAllBios();
}
