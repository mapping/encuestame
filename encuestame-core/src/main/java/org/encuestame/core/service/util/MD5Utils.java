/*
 ************************************************************************************
 * Copyright (C) 2001-2010 encuestame: system online surveys Copyright (C) 2010
 * encuestame Development Team.
 * Licensed under the Apache Software License version 2.0
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to  in writing,  software  distributed
 * under the License is distributed  on  an  "AS IS"  BASIS,  WITHOUT  WARRANTIES  OR
 * CONDITIONS OF ANY KIND, either  express  or  implied.  See  the  License  for  the
 * specific language governing permissions and limitations under the License.
 ************************************************************************************
 */

package org.encuestame.core.service.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 Utils.
 * @author Picado, Juan juan@encuestame.org
 * @since Mar 12, 2010 11:37:48 PM
 * @version $Id: $
 * Taked from shrtlnk project http://tinyurl.com/yfwocal
 */
public class MD5Utils {

    /**
     * Convert md5 bytes into hex values
     * @param data Byte data to be hex'ed
     * @return Returns the hex representation of the md5sum
     */
    private static String convertToHex(byte[] data) {
        final StringBuffer buf = new StringBuffer();
        for (byte aData : data) {
            int halfbyte = (aData >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9))
                    buf.append((char) ('0' + halfbyte));
                else
                    buf.append((char) ('a' + (halfbyte - 10)));
                halfbyte = aData & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    /**
     * Creates an MD5 sum for a text string
     * @param text The string you want to sum
     * @return The md5sum
     * @throws NoSuchAlgorithmException If md5 isn't available
     * @throws UnsupportedEncodingException If the character encoding isn't available
     */
    public static String MD5(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException  {
        MessageDigest md;
        md = MessageDigest.getInstance("MD5");
        byte[] md5hash;
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        md5hash = md.digest();
        return convertToHex(md5hash);
    }

    /**
     * Cut off the MD5sum, limit to 6 characters. Will still result in 16777216 possible combinations, 2^128 isn't needed
     * @param text The sum you want shortened
     * @return The shortened md5sum
     */
    public static String ShortMD5(String text) {
        try {
            return MD5(text).substring(0, 6);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * This will sort the URL parameter by parameter.
     * @param url The URL we want to sort
     * @return Returns the sorted URL
     */
    public static String sortURL(String url) {
        String[] urlArgs = url.split("&");
        java.util.Arrays.sort(urlArgs);
        String ret = "";

        for (String urlArg : urlArgs) {
            ret = ret + urlArg;
        }
        return ret  ;
    }

}