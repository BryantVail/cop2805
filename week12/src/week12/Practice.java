package week12;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Practice {

	static Scanner input;
	static DVR dvr;

	public static void main(String[] args) {

		dvr = new DVR();

		input = new Scanner(System.in);

		boolean keepLooping = true;
		
		while (keepLooping) {

			System.out.println();
			System.out.print("Enter command ('help' for help): ");
			String command = input.nextLine();
			System.out.println();

			switch (command) {
			case "help":
				System.out.println("exit - exit the program");
				System.out.println("help - show help");
				System.out.println("add-recording - add a recording");
				System.out.println("edit-recording - edit a recording");
				System.out.println("delete-recording - delete a recording");
				System.out.println("show-recordings - show recordings");
				break;
			case "exit":
				keepLooping = false;
				break;
			case "add-recording":
				addRecording();
				break;
			case "edit-recording":
				editRecording();
				break;
			case "delete-recording":
				deleteRecording();
				break;
			case "show-recordings":
				showRecordings();
				break;
			}
		}

		input.close();
	}

	private static void addRecording() {
		System.out.print("Enter recording name: ");
		String name = input.nextLine();

		System.out.print("Enter channel: ");
		int channel = Integer.parseInt(input.nextLine());

		System.out.print("Enter start time: ");
		String startTime = input.nextLine();

		System.out.print("Enter end time: ");
		String endTime = input.nextLine();

		dvr.addRecording(name, channel, startTime, endTime);
	}

	private static void editRecording() {

	}

	public static void deleteRecording() {
		System.out.print("Enter recording name: ");
		String name = input.nextLine();
		dvr.deleteRecording(name);
	}

	public static void showRecordings() {
		for (Recording recording : dvr.recordings)
			System.out.println(recording);
	}
}

class Recording {
	public int startHour;
	public int startMinute;
	public int endHour;
	public int endMinute;
	public String name;
	public int channel;

	public Recording(String name, int channel, int startHour, int startMinute, int endHour, int endMinute) {
		this.name = name;
		this.channel = channel;
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.endHour = endHour;
		this.endMinute = endMinute;
	}

	@Override
	public String toString() {
		return name + "(" + startHour + ":" + startMinute + "-" + endHour + ":" + endMinute + ")";
	}
}

class DVR {

	public ArrayList<Recording> recordings = new ArrayList<>();
	public int[] halfHours = new int[48];

	public DVR() {
		recordings.add(new Recording("Game of Thrones", 3, 17, 0, 18, 0));
		recordings.add(new Recording("Matlock", 5, 16, 0, 17, 0));
		recordings.add(new Recording("Macgyver", 5, 17, 0, 17, 30));

	}

	public void addRecording(String name, int channel, String startTime, String endTime) {
		int colonIndex = startTime.indexOf(':');
		int startHour = Integer.parseInt(startTime.substring(0, colonIndex));
		int startMinute = Integer.parseInt(startTime.substring(colonIndex));
		colonIndex = endTime.indexOf(':');
		int endHour = Integer.parseInt(endTime.substring(0, colonIndex));
		int endMinute = Integer.parseInt(endTime.substring(colonIndex));

		Recording recording = new Recording(name, channel, startHour, startMinute, endHour, endMinute);
		recordings.add(recording);
	}

	public void deleteRecording(String name) {
		
		//list structure 'recordings'
		Recording recordingNull = null;
		for(int i = 0; i<recordings.size(); i++) {
			if(this.recordings.get(i).name.equals(name)) {
				this.recordings.get(i) = recordingNull;
				
			}
		}
		
	}

}