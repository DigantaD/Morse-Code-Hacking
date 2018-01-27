import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.prefs.Preferences;
import java.util.Hashtable;

import java.awt.*;

public class IP_Morse extends GetIP {

	public static final Hashtable<String, String> mc = new Hashtable<String, String>(10);

	static {

		
		mc.put(".____", "1");
		mc.put("..___", "2");
		mc.put("...__", "3");
		mc.put("...._", "4");
		mc.put(".....", "5");
		mc.put("_....", "6");
		mc.put("__...", "7");
		mc.put("___..", "8");
		mc.put("____.", "9");
		mc.put("_____", "0");
		mc.put("...", ".");	
	}

	String encoded="", ip=""; 
	int n;

	public void code_encode() {

		String ip_code[] = ip.split(" ");
		int i;
		String ncode;
		for (i=0; i<n; i++) {

			ncode = ip_code[i];
			if (mc.containsValue(ncode) == true) {

				Object key = null;
				String value = ncode;
				for (Map.Entry entry:mc.entrySet()) {

					if (value.equals(entry.getValue())) {

						key = entry.getKey();
						key = key.toString();
						encoded = encoded + key;
						break;
					}
				}
			} else {

				encoded = encoded + "  ";
			}
		}
	}

	public static void main(String[] args) {

		IP_Morse ms = new IP_Morse();
		GetIP gp = new GetIP();
		ip = gp.Ip_Send();
		ms.code_encode();
	}
}