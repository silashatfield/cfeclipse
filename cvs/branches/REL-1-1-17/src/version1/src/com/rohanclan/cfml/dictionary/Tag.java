/*
 * Created on Feb 27, 2004
 *
 * The MIT License
 * Copyright (c) 2004 Rob Rohan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a 
 * copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation 
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software 
 * is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
 * SOFTWARE.
 */
package com.rohanclan.cfml.dictionary;

//import java.util.Set;
//import java.util.HashSet;

/**
 * @author Rob
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class Tag extends Procedure {
	protected boolean single = false;
	protected boolean xmlstyle = false;
	protected boolean hybrid = false;
	protected boolean anyAttribute = false;
	
	/** w3c form tag */
	public static final byte FORM = 16;
	/** w3c table tag */
	public static final byte TABLE = 32;
	
	public Tag(String name, boolean single)
	{
		super(name);
		this.single = single;
	}
	
	public Tag(String name, boolean single, boolean style, byte creator)
	{
		this(name, single);
		this.creator = creator;
		xmlstyle = style;
	}
	
	public Tag(String name, boolean single, boolean style, byte creator, boolean hybrid, boolean anyAttribute)
	{
		this(name, single);
		this.creator = creator;
		xmlstyle = style;
		this.hybrid = hybrid;
		this.anyAttribute = anyAttribute;
	}
	
	/**
	 * returns true if this is a table tag
	 * @return
	 */
	public boolean isTableTag()
	{
		if(getCreatorFlags() == TABLE)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * returns true if this is a form tag
	 * @return
	 */
	public boolean isFormTag()
	{
		if(getCreatorFlags() == FORM)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Is this tag a sinlge tag or does it have a closing
	 * counter part?
	 * @return if single or not
	 */
	public boolean isSingle()
	{
		return single;
	}

	
	
	/**
	 * Is this tag in xml style (mostly used with is single to tell
	 * if the tag shoule be &lt;tag&gt; or &lt;tag/&gt;
	 * @return if xml style or not
	 */
	public boolean isXMLStyle()
	{
		return xmlstyle;
	}
	
	/**
	 * Is this tag a hybrid that can be either single or paired:
	 * e.g. &lt;cftransaction&gt; and &lt;cfinvoke&gt;
	 */
	public boolean isHybrid()
	{
		return hybrid;
	}
	
	/**
	 * Does the tag allow any attribute:
	 * e.g. &lt;cfmodule&gt;
	 */
	public boolean allowsAnyAttribute()
	{
		return anyAttribute;
	}
	
	public String toString()
	{
		return name;
	}
}