// based on https://github.com/PyYoshi/cChardet.git

package net.pms.util.universalchardet;


public class Latin2CzechModel extends CzechModel {
	public static final float TYPICAL_POSITIVE_RATIO = 0.968107f;

	public Latin2CzechModel() {
		super(czechLatin2ModelCharToOrderMap, ConstantsExtended.CHARSET_ISO_8859_2);
	}

	private static final short[] czechLatin2ModelCharToOrderMap = new short[] {
		255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,
		255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,
		255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,
		255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,255,
		255, 32, 42, 49, 41, 63, 52, 36, 38, 53, 35, 37, 59, 44, 34, 47,
		 33,180, 48, 45, 40, 56, 39, 76, 70, 75, 51,255,255,255,255,255,
		255, 3, 24, 19, 11, 1, 50, 57, 17, 8, 16, 12, 5, 10, 4, 2,
		 14, 58, 15, 6, 7, 13, 9, 80, 62, 21, 23,255,255,255,255,255,
		179,178,177,176,175,174,173,172,171,170,169,168,167,166,165,164,
		163,162,161,160,159,158,157,156,155,154,153,152,151,150,149,148,
		147,146,145,144,143,142,141,140,139, 64,138, 79,137,136, 61,135,
		134,133,132,131,130,129,128,127,126, 28,125, 43,124,123, 25,122,
		121, 71,120,119,118,117,116,115, 60, 72,114,113, 73, 69,112, 78,
		111,110,109, 68,108,107,106,105, 65, 77, 67,104,103, 74,102,101,
		100, 20, 99, 98, 97, 96, 95, 94, 27, 29, 93, 92, 22, 18, 91, 55,
		 90, 89, 54, 66, 88, 87, 86, 85, 26, 31, 46, 84, 83, 30, 82, 81,
	};
}
