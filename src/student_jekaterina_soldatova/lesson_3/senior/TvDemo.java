package student_jekaterina_soldatova.lesson_3.senior;

 class TvDemo {
     public static void main(String[] args) {
         Tv tv = new Tv(false, 9, 1);

         tv.changeMode();
         if (tv.tvMode) {
             System.out.println("TV is now on, volume: " + tv.tvVolume + ", channel: " + tv.tvChannel + " - " + tv.getChannelName());
         }
         else {
             System.out.println("TV is off now");
         }

         tv.changeVolume();

         tv.changeChannel();
         System.out.println("You are now watching " + tv.getChannelName());
     }

}
