package utility;
import model.User;
interface EligibiltyInterface{
	public boolean checkUser(User user);
	public boolean checkQuizAnswer(String points);
}