    package javabasedconfig;
    import org.Demo.Character;
    import org.Demo.Cj1;
    import org.Demo.s_core_autowire.GtaIv;
    import org.Demo.s_core_autowire.MortalShell;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.context.annotation.Primary;
    import org.springframework.context.annotation.Scope;

    @Configuration
    public class JavaConfig {
          @Bean(name = "Doom")
          @Scope("prototype")
        public Game getGame() {
           return new Game();
        }
           @Bean
                   @Scope("prototype")
        public Character getCharacter() {
              return new Character();
        }
          @Bean
        public Cj1 getCj1( @Qualifier("mShell") org.Demo.s_core_autowire.Game  game) {

              Cj1 cj1 = new Cj1();
              cj1.setName("Daniel");
              cj1.setAge(30);
              cj1.setEmail("Doom@Doom.com");
              cj1.setGame(game);
                return  cj1;
        }

      @Bean
        public GtaIv getGtaIv() {
              GtaIv gtaIv = new GtaIv();
              gtaIv.jump();
              gtaIv.wasd();
              gtaIv.save();
              return gtaIv;
        }

        @Bean
        public MortalShell mShell() {
              MortalShell mShell = new MortalShell();
              mShell.jump();
              mShell.save();
              mShell.wasd();
              return mShell;
        }
    }
