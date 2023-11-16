public class Animal {
        public void say() {
                System.out.println(this.getClass());
                System.out.println(this.state().getClass());
                System.out.println("Animal 은 지금" + this.state()); // self 의 state 를 실행하라 -> self 전송
        }

        public String state() {
                return "배고픈 상태입니다.";
        }
}
