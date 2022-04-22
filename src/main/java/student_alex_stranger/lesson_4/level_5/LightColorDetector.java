package student_alex_stranger.lesson_4.level_5;

public class LightColorDetector {

    public String detect(int waveLength) {
      if (380 <= waveLength && waveLength <= 449) {
          return ("Violet");
      } else if (450 <= waveLength && waveLength <= 494) {
          return ("Blue");
      } else if (495 <= waveLength && waveLength <= 569) {
          return ("Green");
      } else if (570 <= waveLength && waveLength <= 589) {
          return ("Yellow");
      } else if (590 <= waveLength && waveLength <= 619) {
          return ("Orange");
      } else if (620 <= waveLength && waveLength <= 750) {
          return ("Red");
      } else {
          return ("Invisible light");
      }
    }
}
