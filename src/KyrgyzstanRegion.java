public enum KyrgyzstanRegion {
    NARYN {
        @Override
        public void special() {
            System.out.println("Naryn Mountain region, clean air!");
        }
    },
    CHUI {
        @Override
        public void special() {
            System.out.println("Chui Crowded , developing air!");
        }
    },
    JALAL_ABAD {
        @Override
        public void special() {
            System.out.println("Arslanbap is beatiful place");
        }
    },
    YSSYK_KOL {
        @Override
        public void special() {
            System.out.println("Wonderful like Issyk - Kul");
        }
    },
    BATKEN {
        @Override
        public void special() {
            System.out.println("Batken youngest region ");
        }
    },
    OSH {
        @Override
        public void special() {
            System.out.println("Osh oldest area");
        }
    },
    TALAS {
        @Override
        public void special() {
            System.out.println("Darling girls of Talas");
        }
    };


    public abstract void special();
}
