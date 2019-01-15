
public class ServerNameGenerator {
    public static void main(String[] args){

String[] adjectives = {"beneficial","merciful","nostalgic","innocent","closed","difficult","knowledgeable","different","highfalutin","ruddy"};

        String[] nouns = {"volcano","oranges","part","smile","price","calendar","rain","dirt","dinner","frogs"};

        System.out.println("Here is your server name: \n" + randomAdjective(adjectives) + " - " + randomNoun(nouns));

    }



    public static String randomAdjective(String[] adjectives){
        double randomDouble = Math.random();
        randomDouble = randomDouble * 10 + 1;
        int num = (int) randomDouble;

        return adjectives[num];

}

    public static String randomNoun(String[] nouns){
        double randomDouble = Math.random();
        randomDouble = randomDouble * 10 + 1;
        int num = (int) randomDouble;

        return nouns[num];

    }


}
