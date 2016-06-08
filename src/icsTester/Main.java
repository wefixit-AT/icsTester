package icsTester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.fortuna.ical4j.data.CalendarBuilder;
import net.fortuna.ical4j.data.ParserException;
import net.fortuna.ical4j.model.Calendar;

public class Main {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("Please add as first argument a ics file");
			System.exit(1);
		}
		System.out.println("Start icsTester with file: " + args[0]);
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file");
			System.exit(1);
		}
		CalendarBuilder builder = new CalendarBuilder();

		try {
			Calendar calendar = builder.build(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("General IOException");
			e.printStackTrace();
			System.exit(1);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			System.out.println("We catch a ParseException: " + e.getCause());
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("The given ics file is valid");
	}
}
