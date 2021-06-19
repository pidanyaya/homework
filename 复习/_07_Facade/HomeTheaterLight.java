public class HomeTheaterLight {
  private DVDPlayer dvdPlayer;
  private Popcorn popcorn;
  private Screen screen;
  private TheaterLight theaterLight;

  public HomeTheaterLight() {
    this.dvdPlayer = dvdPlayer.getInstance();
    this.popcorn = popcorn.getInstance();
    this.screen = screen.getInstance();
    this.theaterLight = theaterLight.getInstance();
  }

  public void ready() {
    dvdPlayer.on();
    popcorn.on();
    screen.down();
    theaterLight.on();
  }

  public void play() {
    dvdPlayer.play();
    popcorn.pop();
  }

  public void pause() {
    popcorn.pause();
    dvdPlayer.pause();
  }

  public void end() {
    dvdPlayer.off();
    popcorn.off();
    screen.up();
    theaterLight.off();
  }
}
