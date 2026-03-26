package commerce;

import java.util.List;

public class CommerceSystem {
    private List<Category> categories;

    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }
    // 작업 시작
    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            // 목록 출력
            for (int i = 0; i < categories.size(); i++) { // 컴퓨터는 숫자를 0부터 센다.
                System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
            }

        }
    }

}
