package main.java.Bot;
import java.io.File;
import org.alicebot.ab.Bot;
import org.alicebot.ab.MagicBooleans;

public class AddAiml {
private static final boolean TRACE_MODE = false;
static String botName = "super";
public static void main(String ...obj)
{

	try
	{
		String resourcesPath = getResourcesPath();
	
	System.out.println(resourcesPath);
	MagicBooleans.trace_mode = TRACE_MODE;
	Bot bot = new Bot("super", resourcesPath);
	bot.writeAIMLFiles();
	} catch(Exception e)
	{
		System.out.println("You have got this error");
		e.printStackTrace();
	}
}

private static java.lang.String getResourcesPath() {
	File currDir = new File(".");
	String path = currDir.getAbsolutePath();
	path = path.substring(0, path.length() - 2);
	System.out.println(path);
	String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
	return resourcesPath;
}
}
