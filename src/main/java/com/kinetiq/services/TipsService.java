import java.util.List;
import java.util.ArrayList;

public class TipsService {

    public List<String> getTips() {
        List<String> tips = new ArrayList<>();
        tips.add("Tip 1: Stay organized to maximize productivity.");
        tips.add("Tip 2: Take regular breaks to avoid burnout.");
        tips.add("Tip 3: Use tools that enhance your efficiency.");
        tips.add("Tip 4: Keep learning and updating your skills.");
        tips.add("Tip 5: Collaborate and communicate effectively with your team.");
        return tips;
    }

    public String suggestTip() {
        List<String> tips = getTips();
        int randomIndex = (int) (Math.random() * tips.size());
        return tips.get(randomIndex);
    }
}