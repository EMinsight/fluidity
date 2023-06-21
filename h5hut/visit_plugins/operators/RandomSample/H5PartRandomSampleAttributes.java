package llnl.visit.operators;

import llnl.visit.AttributeSubject;
import llnl.visit.CommunicationBuffer;
import llnl.visit.Plugin;

// ****************************************************************************
// Class: H5PartRandomSampleAttributes
//
// Purpose:
//    Randomly reduce an H5Part point mesh
//
// Notes:      Autogenerated by xml2java.
//
// Programmer: xml2java
// Creation:   Thu Mar 16 10:26:56 PDT 2006
//
// Modifications:
//
// ****************************************************************************

public class H5PartRandomSampleAttributes extends AttributeSubject implements Plugin
{
    public H5PartRandomSampleAttributes()
    {
        super(1);

        factor = 1f;
    }

    public H5PartRandomSampleAttributes(H5PartRandomSampleAttributes obj)
    {
        super(1);

        factor = obj.factor;

        SelectAll();
    }

    public boolean equals(H5PartRandomSampleAttributes obj)
    {
        // Create the return value
        return ((factor == obj.factor));
    }

    public String GetName() { return "H5PartRandomSample"; }
    public String GetVersion() { return "1.0"; }

    // Property setting methods
    public void SetFactor(float factor_)
    {
        factor = factor_;
        Select(0);
    }

    // Property getting methods
    public float GetFactor() { return factor; }

    // Write and read methods.
    public void WriteAtts(CommunicationBuffer buf)
    {
        if(WriteSelect(0, buf))
            buf.WriteFloat(factor);
    }

    public void ReadAtts(int n, CommunicationBuffer buf)
    {
        buf.ReadByte();
        SetFactor(buf.ReadFloat());
    }


    // Attributes
    private float factor;
}