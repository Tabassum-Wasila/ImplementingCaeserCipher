public class WordPlay {
	public boolean isVowel(char ch)
	{
		char vowel[] = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		for (char c : vowel)
		{
			if(c == ch)
				return true;
		}
		return false;
	}
	public void tester()
	{
		boolean flag = isVowel('F');
		System.out.println(flag);
		
		flag = isVowel('a');
		System.out.println(flag);
	}
	public static void main(String[] args)
	{
		WordPlay wp = new WordPlay();
		wp.tester();
	}
}
