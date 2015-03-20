package org.teachingkidsprogramming.section08tdd;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;

import org.teachingextensions.approvals.lite.util.ObjectUtils;

public class Tile {
  private final static String[] resources = { "Batgirl1a.png", "Batgirl1b.png",
      "Batgirl1c.png", "Batgirl2a.png", "Batgirl2b.png", "Batgirl2c.png",
      "Batgirl3a.png", "Batgirl3b.png", "Batgirl3c.png" };
  private final static int      width     = 122;
  private final static int      height    = 122;
  private Image                 image;
  private Point                 position;
  private Point                 target;
  private int                   imageIdx;

  public Tile(int imageIdx, Point position) {
    this.imageIdx = imageIdx;
    this.position = new Point(position);
    this.image = ObjectUtils.loadImage(this.getClass(), resources[imageIdx]);
  }

  public Tile(Tile t) {
    this(t.imageIdx, new Point(t.position));
  }

  public void paint(Graphics2D g2d) {
    g2d.drawImage(this.image, this.position.x, this.position.y, width, height,
        null);
  }

  public boolean isAt(Point point) {
    return point == null
        || (this.position.x == point.x && this.position.y == point.y);
  }

  public void moveTo(Point target) {
    this.target = new Point(target.x, target.y);
  }

  public boolean isMovingTo(Point target) {
    return this.target != null && this.target.x == target.x
        && this.target.y == target.y;
  }

  public void step() {
    int size = 1;

    int x = stepHorizontal(size);
    int y = stepVertical(size);
    this.position = new Point(x, y);
  }

  private int stepVertical(int size) {
    if (this.position.y < this.target.y) {
      return this.position.y + size;
    }
    if (this.target.y < this.position.y) {
      return this.position.y - size;
    }
    return this.position.y;
  }

  private int stepHorizontal(int size) {
    if (this.position.x < this.target.x) {
      return this.position.x + size;
    }
    if (this.target.x < this.position.x) {
      return this.position.x - size;
    }
    return this.position.x;
  }

  public void teleport() {

    if (this.target != null && !this.isAt(this.target)) {
      this.position = new Point(this.target.x, this.target.y);
    }

  }

  public boolean isAtTarget() {
    return this.isAt(this.target);
  }
}
