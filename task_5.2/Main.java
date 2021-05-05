public class Main {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        List<String> listFamily = new ArrayList<>();
        List<String> listCity = new ArrayList<>();
        while (true) {
            System.out.println("Введите название города");
            String city = scanner.nextLine();

            if (city.isEmpty()) {
                System.out.println("Ввод данных окончен");
                break;
            }
            System.out.println("Введите фамилию семьи, проживающую в этом городе");
            String family = scanner.nextLine();

            if (family.isEmpty()) {
                System.out.println("Ввод данных окончен");
                break;
            }

            listCity.add(city);
            listFamily.add(family);

        }
        System.out.println("Введите название города, чтобы узнать какая семья в нем проживает");
        String city = scanner.nextLine();

        if (listCity.contains(city)) System.out.println("В этом городе проживают: "
                                                        +listFamily.get(listCity.indexOf(city)));
        else System.out.println("В этом городе ни одна из зарегистрированных семей не проживает");

   }
}
