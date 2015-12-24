package org.teachingkidsprogramming.recipes.completed.section05recursion;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DeepDive05Recursion
{
  @Test
  public void changeThePointerToAHand() throws Exception
  {
    Tortoise.getBackgroundWindow().setCursor(Cursor.HAND_CURSOR);
    Assert.assertEquals(getCursor(), Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  }
  @Test
  public void getTheWindow() throws Exception
  {
    Tortoise.getBackgroundWindow().setCursor(Cursor.CROSSHAIR_CURSOR);
    Assert.assertEquals(getCursor(), Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
  }
  @Test
  public void setColorUsingKey() throws Exception
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.DarkGreen);
    Assert.assertEquals(PenColors.Greens.DarkGreen, colors.get(20));
  }
  @Test
  public void findTheGreenKey() throws Exception
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(20, PenColors.Greens.DarkGreen);
    colors.put(30, PenColors.Greens.Green);
    Assert.assertEquals(PenColors.Greens.Green, colors.get(30));
  }
  @Test
  public void findTheColorForTheBananaKey() throws Exception
  {
    HashMap<String, Color> colors = new HashMap<String, Color>();
    colors.put("banana", PenColors.Yellows.Yellow);
    colors.put("apple", PenColors.Reds.Red);
    Assert.assertEquals(PenColors.Yellows.Yellow, colors.get("banana"));
  }
  @Test
  public void findTheNumberPositionOfTheWorld() throws Exception
  {
    List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
    String result = messages.get(1);
    Assert.assertEquals("World!", result);
  }
  @Test
  public void getWhatsLast() throws Exception
  {
    List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
    String result = messages.get(4);
    Assert.assertEquals("You", result);
  }
  @Test
  public void whatIsLastNow() throws Exception
  {
    List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
    messages.set(4, "The rest of them");
    String result = messages.get(4);
    Assert.assertEquals("The rest of them", result);
  }
  @Test
  public void putAQuarterAtTheEnd() throws Exception
  {
    int[] coins = {1, 5, 10, 25};
    Assert.assertEquals(25, coins[3]);
  }
  @Test
  public void getThirdCoin() throws Exception
  {
    int[] coins = {1, 5, 10, 25};
    Assert.assertEquals(10, coins[2]);
  }
  @Test
  public void whichCoinIsSecond() throws Exception
  {
    int[] coins = {1, 5, 10, 25};
    Assert.assertEquals(5, coins[1]);
  }
  @Test
  public void putAFiftyCentPieceFirst() throws Exception
  {
    int[] coins = {1, 5, 10, 25};
    coins[0] = 50;
    Assert.assertEquals(50, coins[0]);
  }
  /**
   * Ignore the following, It's needed to run the deep dive
   *
   *
   *
   *
   *
   *
   *
   *
   *
   *
   */
  public boolean _____  = false;
  public boolean ______ = true;
  public String  ___    = "You need to fill in the blank ___";
  public int     ____   = 0;
  public Color   _______;
  public String ___()
  {
    return ___;
  }
  private Cursor getCursor()
  {
    return Tortoise.getBackgroundWindow().getCanvas().getCursor();
  }
}
