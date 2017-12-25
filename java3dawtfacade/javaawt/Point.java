package javaawt;

import javaawt.geom.Point2D;

public class Point extends Point2D implements java.io.Serializable
{

	public int x;

	public int y;

	public Point()
	{
		this(0, 0);
	}

	public Point(Point p)
	{
		this(p.x, p.y);
	}

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public double getX()
	{
		return x;
	}

	@Override
	public double getY()
	{
		return y;
	}

	public Point getLocation()
	{
		return new Point(x, y);
	}

	public void setLocation(Point p)
	{
		setLocation(p.x, p.y);
	}

	public void setLocation(int x, int y)
	{
		move(x, y);
	}

	@Override
	public void setLocation(double x, double y)
	{
		this.x = (int) Math.floor(x + 0.5);
		this.y = (int) Math.floor(y + 0.5);
	}

	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void translate(int dx, int dy)
	{
		this.x += dx;
		this.y += dy;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Point)
		{
			Point pt = (Point) obj;
			return (x == pt.x) && (y == pt.y);
		}
		return super.equals(obj);
	}

	@Override
	public String toString()
	{
		return getClass().getName() + "[x=" + x + ",y=" + y + "]";
	}
}
