package ru.nlmk.sobolevmv.tm;

import static ru.nlmk.sobolevmv.tm.constant.TerminalConst.*;

public class Main {

    public static void main(final String[] args) {
        displayWelcome();
        run(args);
    }
    private static void displayError(){
      System.out.println("Error! Unknow program argument.");
      System.exit(-1);
    }

    private static void displayHelp(){
      System.out.println("version - Display program version.");
      System.out.println("about -  Display developer info.");
      System.out.println("help - Display list of terminal commands.");
      System.exit(0);
    }

    private static void displayVersion(){
      System.out.println("1.0.0");
      System.exit(0);
    }

    private static void displayAbout(){
      System.out.println("Mikhail Sobolev");
      System.out.println("sobolev_mv@nlmk.com");
      System.exit(0);
    }

    private static void displayWelcome(){
      System.out.println("** WELCOME TO TASK MANAGER **");
    }

    private static void run(final String[] args){
      if (args == null) return;
      if (args.length < 1) return;
      final String param = args[0];
      switch(param) {
          case CMD_HELP:
              displayHelp();
          case CMD_VERSION:
              displayVersion();
          case CMD_ABOUT:
              displayAbout();
          default:
              displayError();
      }
    }





}
