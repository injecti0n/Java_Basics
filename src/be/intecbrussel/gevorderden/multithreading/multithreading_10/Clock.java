package multithreading_10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class Clock extends TimerTask {
   private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

   @Override
   public void run() {
      LocalDateTime time = LocalDateTime.now();
      System.out.println(formatter.format(time));
   }
}
