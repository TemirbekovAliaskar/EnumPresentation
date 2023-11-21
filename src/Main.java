public class Main {
    public static void main(String[] args) {

        KyrgyzstanRegion [] kyrgyzstanRegions = {KyrgyzstanRegion.NARYN,KyrgyzstanRegion.CHUI,KyrgyzstanRegion.JALAL_ABAD,KyrgyzstanRegion.OSH,KyrgyzstanRegion.YSSYK_KOL,KyrgyzstanRegion.TALAS};

        for (KyrgyzstanRegion kyrgyz : kyrgyzstanRegions){
            System.out.println(kyrgyz);
            kyrgyz.special();
        }
    }
}