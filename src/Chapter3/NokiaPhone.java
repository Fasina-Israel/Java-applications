package Chapter3;
import java.util.Scanner;

public class NokiaPhone {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        displayNokia();
        mainMenu();


    }

    private static void mainMenu() {
        String mainMenu = """

                 1 --> Phonebook
                 2 --> Messages
                 3 --> Chat
                 4 --> Call register
                 5 -->Tones
                 6 --> Settings
                 7 --> Call divert
                 8 --> Games
                 9 --> Calculator
                 10 --> Remainders
                 11 --> Clock
                 12 --> Profiles
                 13 --> Sim services
                """;
        System.out.println(mainMenu);
        int menuPrompt = scan.nextInt();
        switch (menuPrompt) {
            case 1:
                displayPhoneBook();
                break;
            case 2:
                message();
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                setting();
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Remainder");
                break;
            case 11:
                clock();
                break;
            case 12:
                System.out.println("Profile");
                break;
            case 13:
                System.out.println("Sim services");

        }

    }

    private static void clock() {
        System.out.println("Clock");
        String Clock = """
                1 --> Alarm Clock
                2 --> Clock setting
                3 --> Date setting
                4 --> Stop watch
                5 --> Count down timer
                6 --> Auto-Update of date and time

                """;
        System.out.println(Clock);
        int clockPrompt = scan.nextInt();
        switch (clockPrompt) {
            case 1:
                System.out.println("Alarm Clock");
                break;
            case 2:
                System.out.println("Clock Setting");
                break;
            case 3:
                System.out.println("Date Setting");
                break;
            case 4:
                System.out.println("Stop Watch");
                break;
            case 5:
                System.out.println("Count down timer");
                break;
            case 6:
                System.out.println("Auto-update of date and time");

        }

    }

    private static void setting() {
        System.out.println("Settings");
        String settings = """
                1 --> Call Setting
                2 --> Phone Setting
                3 --> Security Setting
                4 --> Restore Factory Setting
                """;
        System.out.println(settings);
        int settingPrompt = scan.nextInt();
        switch (settingPrompt) {
            case 1:
                System.out.println("Call setting");
                break;
            case 2:
                System.out.println("Phone setting");
                break;
            case 3:
                System.out.println("Security setting");
                break;
            case 4:
                System.out.println("Restore Factory setting");

        }

    }

    private static void tones() {
        System.out.println("Tones");
        String tone = """
                1 --> Ringing tone
                2 --> Ringing volume
                3 --> Incoming Call Alert
                4 --> Composer
                5 --> Message alert Tone
                6 --> Keypad tone
                7 --> Warning and Game Tone
                8 --> Vibrating Alert
                9 --> Screen Saver

                """;
        System.out.println(tone);
        int toneOption = scan.nextInt();
        switch (toneOption) {

            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming Call Alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message Alert Tone");
                break;
            case 6:
                System.out.println("Keypad Tone");
                break;
            case 7:
                System.out.println("Warning and Gaming tone");
                break;
            case 8:
                System.out.println("Vibrating Alert");
                break;
            case 9:
                System.out.println("Screen saver");

        }

    }

    private static void callRegister() {
        System.out.println("Call Register");
        String callRegister = """
                1 --> Missed Calls
                2 --> Received Calls
                3 --> Dialled Numbers
                4 --> Erase recent call list
                5 --> Show Call duration
                6 --> Show Call cost
                7 --> Call cost setting
                8 --> Prepaid Credit
                9 --> Ringing tone
                10--> Ringing Volume
                11--> Incoming Call Alert
                12--> Composer

                """;
        System.out.println(callRegister);
        int callRegisterOption = scan.nextInt();
        switch (callRegisterOption) {
            case 1:
                System.out.println("Missed Calls");
                break;
            case 2:
                System.out.println("Received Calls");
                break;
            case 3:
                System.out.println("Dialled Numbers");
                break;
            case 4:
                System.out.println("Erase recent calls");
                break;
            case 5:
                System.out.println("Show Call duration");
                break;
            case 6:
                System.out.println("Show call cost");
                break;
            case 7:
                System.out.println("Call cost setting");
                break;
            case 8:
                System.out.println("Prepaid Credit");
                break;
            case 9:
                System.out.println("Ringing tone");
                break;
            case 10:
                System.out.println("Ringing Volume");
                break;
            case 11:
                System.out.println("Incoming call Alert");
                break;
            case 12:
                System.out.println("Composer");
        }
    }

    private static void message() {
        String messages = """
                1 --> Write Message
                2 --> Inbox
                3 --> Outbox
                4 --> Picture Messages
                5 --> Templates
                6 --> Smileys
                7 --> Message Settings
                8 --> Info Service
                9 --> Voice Mailbox number
                10--> Service Command Editor

                """;
        System.out.println(messages);
        int messageOption = scan.nextInt();
        switch (messageOption) {
            case 1:
                System.out.println("Write message");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture Message");
                break;
            case 5:
                System.out.println("Template");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                System.out.println("Message Settings");
                break;
            case 8:
                System.out.println("Info Service");
                break;
            case 9:
                System.out.println("Voice Mailbox number");
                break;
            case 10:
                System.out.println("Service Command Editor");
                break;


        }

    }

    private static void displayPhoneBook() {
        System.out.println("Phonebook");
        String phone = """
                1 --> Search
                2 --> Service No
                3 --> Add name
                4 --> Erase
                5 --> Edit
                6 --> Assign Tone
                7 --> Send b-cards
                8 --> Options
                9 --> Speed Dials
                10--> Voice Tags
                """;
        System.out.println(phone);
        int phonebook = scan.nextInt();
        switch (phonebook) {
            case 1:
                System.out.println("search");
                break;
            case 2:
                System.out.println("service no");
                break;

            case 4:

        }


    }

    private static void displayNokia() {

        System.out.println("""
                        
                ####    ##  #########  ##   ###  ##     ####
                ## ##   ##  ##     ##  ## ##     ##   ##    ##
                ##  ##  ##  ##     ##  ###       ##  #########
                ##   ## ##  ##     ##  ## ##     ##  ##     ##
                ##    ####  #########  ##   ###  ##  ##     ##
                """);
    }


}
