package com.keithpower.gekmlib;
/**
 * AutoGenerated.
 *
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class LatLonBox extends ObjectNode
{
    public static double DEFAULT_NORTH=180.0;
    protected double north = DEFAULT_NORTH;
    private boolean isNorthDirty;
    protected double south;
    private boolean isSouthDirty;
    public static double DEFAULT_EAST=180.0;
    protected double east = DEFAULT_EAST;
    private boolean isEastDirty;
    protected double west;
    private boolean isWestDirty;
    public static double DEFAULT_ROTATION=0;
    protected double rotation = DEFAULT_ROTATION;
    private boolean isRotationDirty;


    public LatLonBox()
    {
        super();
    }

    public LatLonBox(Node parent)
    {
        super(parent);
    }

    public double getNorth()
    {
        return this.north;
    }

    public void setNorth(double value)
    {
        this.north = value;
        this.isNorthDirty = true;
        setDirty();
    }

    public double getSouth()
    {
        return this.south;
    }

    public void setSouth(double value)
    {
        this.south = value;
        this.isSouthDirty = true;
        setDirty();
    }

    public double getEast()
    {
        return this.east;
    }

    public void setEast(double value)
    {
        this.east = value;
        this.isEastDirty = true;
        setDirty();
    }

    public double getWest()
    {
        return this.west;
    }

    public void setWest(double value)
    {
        this.west = value;
        this.isWestDirty = true;
        setDirty();
    }

    public double getRotation()
    {
        return this.rotation;
    }

    public void setRotation(double value)
    {
        this.rotation = value;
        this.isRotationDirty = true;
        setDirty();
    }



    public String toKML()
    {
        return toKML(false);
    }
    public String toKML(boolean suppressEnclosingTags)
    {
        String kml="";
        if(!suppressEnclosingTags)
        {
        kml+="<LatLonBox";
        if(this.id!=null)
        {
            kml+=" id=\""+this.getId()+"\"";
        }
        if(this.targetId!=null)
        {
            kml+=" targetId=\""+this.getTargetId()+"\"";
        }
        kml+=">\n";
        }
        kml+=super.toKML(true);
        if(this.north!=DEFAULT_NORTH)
        {
            kml+="<north>"+this.north+"</north>\n";
        }
        kml+="<south>"+this.south+"</south>\n";
        if(this.east!=DEFAULT_EAST)
        {
            kml+="<east>"+this.east+"</east>\n";
        }
        kml+="<west>"+this.west+"</west>\n";
        if(this.rotation!=DEFAULT_ROTATION)
        {
            kml+="<rotation>"+this.rotation+"</rotation>\n";
        }
        if(!suppressEnclosingTags)
        {
            kml+="</LatLonBox>\n";
        }
        return kml;
    }
    public String toUpdateKML()
    {
        return toUpdateKML(false);
    }
    public String toUpdateKML(boolean suppressEnclosingTags)
    {
        if(!isDirty())
        {
            return "";
        }
        String change = "";
        boolean isPrimDirty = isPrimitiveDirty(); // need to track it after object is setNotDirty
        if(isPrimDirty && !suppressEnclosingTags)
        {
        change+="<LatLonBox";
        if(this.id!=null)
        {
            change+=" id=\""+this.getId()+"\"";
        }
        if(this.targetId!=null)
        {
            change+=" targetId=\""+this.getTargetId()+"\"";
        }
        change+=">\n";
        }
        change+=super.toUpdateKML(true);
        if(this.isNorthDirty)
        {
            change+="<north>"+this.north+"</north>\n";
            this.isNorthDirty = false;
        }
        if(this.isSouthDirty)
        {
            change+="<south>"+this.south+"</south>\n";
            this.isSouthDirty = false;
        }
        if(this.isEastDirty)
        {
            change+="<east>"+this.east+"</east>\n";
            this.isEastDirty = false;
        }
        if(this.isWestDirty)
        {
            change+="<west>"+this.west+"</west>\n";
            this.isWestDirty = false;
        }
        if(this.isRotationDirty)
        {
            change+="<rotation>"+this.rotation+"</rotation>\n";
            this.isRotationDirty = false;
        }
        if(isPrimDirty && !suppressEnclosingTags)
        {
        change+="</LatLonBox>\n";
        }
        setNotDirty();
        return change;
    }
    public Object clone() throws CloneNotSupportedException
    {
        LatLonBox result = (LatLonBox)super.clone();
        return result;
    }
    public void setRecursiveNotDirty()
    {
        super.setRecursiveNotDirty();
        this.isNorthDirty = false;
        this.isSouthDirty = false;
        this.isEastDirty = false;
        this.isWestDirty = false;
        this.isRotationDirty = false;
    }
}