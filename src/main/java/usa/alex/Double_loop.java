package usa.alex;

public class Double_loop {
    public String calculateLoop() {
        int i = -1;

        String sum = "";

        while (i >= -9) {
            sum = sum + i;
            i = i - 1;
        }

        return sum + "-";
    }
}
