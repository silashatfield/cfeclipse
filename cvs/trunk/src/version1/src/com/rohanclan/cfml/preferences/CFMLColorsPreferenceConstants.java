/*
 * Created on Nov 12, 2004
 *
 * Creates the preference key names for the CFMLColors preference page and sets the default values.
 */
package com.rohanclan.cfml.preferences;


import org.eclipse.jface.preference.IPreferenceStore;


/**
 * @author Stephen Milligan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CFMLColorsPreferenceConstants extends AbstractPreferenceConstants {
	
	
	/** Preference key identifier for page default text */
	public static final String P_COLOR_DEFAULT_TEXT = "defaultTextColor";
	
	/** Preference key identifier for cfml attribute strings */
	public static final String P_COLOR_CFSTRING = "cfstringColor";

	/** Preference key identifier for cfml tags */
	public static final String P_COLOR_CFTAG = "cftagColor";
	
	/** Preference key identifier for cfml keywords (eq, and, or, et cetra) */
	public static final String P_COLOR_CFKEYWORD = "cfkeywordColor";
	
	/** Preference key identifier for cfml numbers */
	public static final String P_COLOR_CFNUMBER = "cfnumberColor";
	
	/** Preference key identifier for cfml comment */
	public static final String P_COLOR_CFCOMMENT = "cfcommentColor";

	/** Preference key identifier for cfscript text color*/
	public static final String P_COLOR_CFSCRIPT_TEXT = "cfscriptTextColor";
	
	/** Preference key identifier for cfscript keyword color*/
	public static final String P_COLOR_CFSCRIPT_KEYWORD = "cfscriptKeywordColor";
	
	/** Preference key identifier for cfscript function color*/
	public static final String P_COLOR_CFSCRIPT_FUNCTION = "cfscriptfunctionColor";
	
	/** Preference key identifier for cfscript string color*/
	public static final String P_COLOR_CFSCRIPT_STRING = "cfscriptStringColor";

	
	/**
	 * Sets up the default values for the preferences managed by {@link CFMLColorsPreferencePage}
	 * <ul>
	 * 	<li>P_COLOR_DEFAULT_TEXT - "0,0,0"</li>
	 * 	<li>P_COLOR_CFSTRING - "0,0,255"</li>
	 * 	<li>P_COLOR_CFTAG - "128,0,0"</li>
	 * 	<li>P_COLOR_CFKEYWORD - "0,0,255"</li>
	 * 	<li>P_COLOR_CFNUMBER - "255,10,10"</li>
	 * 	<li>P_COLOR_CFCOMMENT - "128,128,128"</li>
	 * 	<li>P_COLOR_CFSCRIPT_TEXT - "0,0,0"</li>
	 * 	<li>P_COLOR_CFSCRIPT_KEYWORD - "0,0,255"</li>
	 * 	<li>P_COLOR_CFSCRIPT_STRING - "0,102,0"</li>
	 * </ul>
	 */
	public static void setDefaults(IPreferenceStore store) { 
		store.setDefault(P_COLOR_DEFAULT_TEXT,"0,0,0");
		store.setDefault(P_COLOR_CFSTRING,"0,0,255");
		store.setDefault(P_COLOR_CFTAG,"128,0,0");
		store.setDefault(P_COLOR_CFKEYWORD,"0,0,255");
		store.setDefault(P_COLOR_CFNUMBER,"255,10,10");
		store.setDefault(P_COLOR_CFCOMMENT,"128,128,128");
		store.setDefault(P_COLOR_CFSCRIPT_TEXT,"0,0,0");
		store.setDefault(P_COLOR_CFSCRIPT_KEYWORD,"0,0,255");
		store.setDefault(P_COLOR_CFSCRIPT_STRING,"0,102,0");
	}

}