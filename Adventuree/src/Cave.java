public class Cave extends BattleLoc{
    //mağara savaş alanı burada zombi ile savaşılacak.
    public Cave( Player player) {
        super(4, "Mağara", player, new Zombie(),"food");
    }
}
