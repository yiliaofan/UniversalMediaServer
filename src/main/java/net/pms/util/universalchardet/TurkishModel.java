// based on https://github.com/PyYoshi/cChardet.git

package net.pms.util.universalchardet;

import org.mozilla.universalchardet.prober.sequence.SequenceModel;

public class TurkishModel extends SequenceModel {
	public static final float TYPICAL_POSITIVE_RATIO = 0.970290f;

	public TurkishModel(short[] charToOrderMap, String name) {
		super(
				charToOrderMap,
				turkishLangModel,
				TYPICAL_POSITIVE_RATIO,
				false,
				name);
	}

	private static final byte[] turkishLangModel = new byte[] {
		3,2,3,3,3,1,3,3,3,3,3,3,3,3,2,1,1,3,3,1,3,3,0,3,3,3,3,3,0,3,1,3,
		3,2,1,0,0,1,1,0,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,0,2,2,0,0,1,0,0,1,
		3,2,2,3,3,0,3,3,3,3,3,3,3,2,3,1,0,3,3,1,3,3,0,3,3,3,3,3,0,3,0,3,
		3,1,1,0,1,0,1,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,2,2,0,0,0,1,0,1,
		3,3,2,3,3,0,3,3,3,3,3,3,3,2,3,1,1,3,3,0,3,3,1,2,3,3,3,3,0,3,0,3,
		3,1,1,0,0,0,1,0,0,0,0,1,1,0,1,2,1,0,0,0,1,0,0,0,0,2,0,0,0,0,0,1,
		3,3,3,3,3,3,2,3,3,3,3,3,3,3,3,1,3,3,2,0,3,2,1,2,2,1,3,3,0,0,0,2,
		2,2,0,1,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,1,0,0,1,
		3,3,3,2,3,3,1,2,3,3,3,3,3,3,3,1,3,2,1,0,3,2,0,1,2,3,3,2,1,0,0,2,
		2,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,2,0,2,0,0,0,
		1,0,1,3,3,1,3,3,3,3,3,3,3,1,2,0,0,2,3,0,2,3,0,0,2,2,2,3,0,3,0,1,
		2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,0,3,3,3,0,3,2,0,2,3,2,3,3,1,0,0,2,
		3,2,0,0,1,0,0,0,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,0,1,1,1,0,2,0,0,1,
		3,3,3,2,3,3,2,3,3,3,3,2,3,3,3,0,3,3,0,0,2,1,0,0,2,3,2,2,0,0,0,2,
		2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,1,0,2,0,0,1,
		3,3,3,2,3,3,3,3,3,3,3,2,3,3,3,0,3,2,0,1,3,2,1,1,3,2,3,2,1,0,0,2,
		2,2,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,
		3,3,3,2,3,3,3,3,3,3,3,2,3,3,3,0,3,2,2,0,2,3,0,0,2,2,2,2,0,0,0,2,
		3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0,1,0,0,0,
		3,3,3,3,3,3,3,2,2,2,2,3,2,3,3,0,3,3,1,1,2,2,0,0,2,2,3,2,0,0,1,3,
		0,3,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,
		3,3,3,2,3,3,3,2,1,2,2,3,2,3,3,0,3,2,0,0,1,1,0,1,1,2,1,2,0,0,0,1,
		0,3,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,
		3,3,3,2,3,3,2,3,2,2,2,3,3,3,3,1,3,1,1,0,3,2,1,1,3,3,2,3,1,0,0,1,
		1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,2,0,0,1,
		3,2,2,3,3,0,3,3,3,3,3,3,3,2,2,1,0,3,3,1,3,3,0,1,3,3,2,3,0,3,0,3,
		2,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,
		2,2,2,3,3,0,3,3,3,3,3,3,3,3,3,0,0,3,2,0,3,3,0,3,2,3,3,3,0,3,1,3,
		2,0,0,0,0,0,0,0,0,0,0,1,0,1,2,0,1,0,0,0,0,0,0,0,2,2,0,0,1,0,0,1,
		3,3,3,1,2,3,3,1,0,0,1,0,0,3,3,2,3,0,0,2,0,0,2,0,2,0,0,0,2,0,2,0,
		0,3,1,0,1,0,0,0,2,2,1,0,1,1,2,1,2,2,2,0,2,1,1,0,0,0,2,0,0,0,0,0,
		1,2,1,3,3,0,3,3,3,3,3,2,3,0,0,0,0,2,3,0,2,3,1,0,2,3,1,3,0,3,0,2,
		3,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,1,3,3,2,2,3,2,2,0,1,2,3,0,1,2,1,0,1,0,0,0,1,0,2,2,0,0,0,1,
		1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,1,0,0,0,
		3,3,3,1,3,3,1,1,3,3,1,1,3,3,1,0,2,1,2,0,2,1,0,0,1,1,2,1,0,0,0,2,
		2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,1,0,2,1,3,0,0,2,0,0,3,3,0,3,0,0,1,0,1,2,0,0,1,1,2,2,0,1,0,
		0,1,2,1,1,0,1,0,1,1,1,1,1,0,1,1,1,2,2,1,2,0,1,0,0,0,0,0,0,1,0,0,
		3,3,3,2,3,2,3,3,0,2,2,2,3,3,3,0,3,0,0,0,2,2,0,1,2,1,1,1,0,0,0,1,
		0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,
		3,3,3,3,3,3,2,1,2,2,3,3,3,3,2,0,2,0,0,0,2,2,0,0,2,1,3,3,0,0,1,1,
		1,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,
		1,1,2,3,3,0,3,3,3,3,3,3,2,2,0,2,0,2,3,2,3,2,2,2,2,2,2,2,1,3,2,3,
		2,0,2,1,2,2,2,2,1,1,2,2,1,2,2,1,2,0,0,2,1,1,0,2,1,0,0,1,0,0,0,1,
		2,3,3,1,1,1,0,1,1,1,2,3,2,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,
		0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,2,2,2,3,2,3,2,2,1,3,3,3,0,2,1,2,0,2,1,0,0,1,1,1,1,1,0,0,1,
		2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,2,0,1,0,0,0,
		3,3,3,2,3,3,3,3,3,2,3,1,2,3,3,1,2,0,0,0,0,0,0,0,3,2,1,1,0,0,0,0,
		2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,
		3,3,3,2,2,3,3,2,1,1,1,1,1,3,3,0,3,1,0,0,1,1,0,0,3,1,2,1,0,0,0,0,
		0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,
		3,3,3,2,2,3,2,2,2,3,2,1,1,3,3,0,3,0,0,0,0,1,0,0,3,1,1,2,0,0,0,1,
		1,0,0,1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,
		1,1,1,3,3,0,3,3,3,3,3,2,2,2,1,2,0,2,1,2,2,1,1,0,1,2,2,2,2,2,2,2,
		0,0,2,1,2,1,2,1,0,1,1,3,1,2,1,1,2,0,0,2,0,1,0,1,0,1,0,0,0,1,0,1,
		3,3,3,1,3,3,3,0,1,1,0,2,2,3,1,0,3,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,
		1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,2,0,0,2,2,1,0,0,1,0,0,3,3,1,3,0,0,1,1,0,2,0,3,0,0,0,2,0,1,1,
		0,1,2,0,1,2,2,0,2,2,2,2,1,0,2,1,1,0,2,0,2,1,2,0,0,0,0,0,0,0,0,0,
		3,3,3,1,3,2,3,2,0,2,2,2,1,3,2,0,2,1,2,0,1,2,0,0,1,0,2,2,0,0,0,2,
		1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,
		3,3,3,0,3,3,1,1,2,3,1,0,3,2,3,0,3,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,
		1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		0,0,0,3,3,0,3,3,2,3,3,2,2,0,0,0,0,1,2,0,1,3,0,0,0,3,1,1,0,3,0,2,
		2,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,1,2,2,1,0,3,1,1,1,1,3,3,2,3,0,0,1,0,1,2,0,2,2,0,2,2,0,2,1,
		0,2,2,1,1,1,1,0,2,1,1,0,1,1,1,1,2,1,2,1,2,0,1,0,1,0,0,0,0,0,0,0,
		3,3,3,0,1,1,3,0,0,1,1,0,0,2,2,0,3,0,0,1,1,0,1,0,0,0,0,0,2,0,0,0,
		0,3,1,0,1,0,1,0,2,0,0,1,0,1,0,1,1,1,2,1,1,0,2,0,0,0,0,0,0,0,0,0,
		3,3,3,0,2,0,2,0,1,1,1,0,0,3,3,0,2,0,0,1,0,0,2,1,1,0,1,0,1,0,1,0,
		0,2,0,1,2,0,2,0,2,1,1,0,1,0,2,1,1,0,2,1,1,0,1,0,0,0,1,1,0,0,0,0,
		3,2,3,0,1,0,0,0,0,0,0,0,0,1,2,0,1,0,0,1,0,0,1,0,0,0,0,0,2,0,0,0,
		0,0,1,1,0,0,1,0,1,0,0,1,0,0,0,2,1,0,1,0,2,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,0,0,2,3,0,0,1,0,1,0,2,3,2,3,0,0,1,3,0,2,1,0,0,0,0,2,0,1,0,
		0,2,1,0,0,1,1,0,2,1,0,0,1,0,0,1,1,0,1,1,2,0,1,0,0,0,0,1,0,0,0,0,
		3,2,2,0,0,1,1,0,0,0,0,0,0,3,1,1,1,0,0,0,0,0,1,0,0,0,0,0,2,0,1,0,
		0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,
		0,0,0,3,3,0,2,3,2,2,1,2,2,1,1,2,0,1,3,2,2,2,0,0,2,2,0,0,0,1,2,1,
		3,0,2,1,1,0,1,1,1,0,1,2,2,2,1,1,2,0,0,0,0,1,0,1,1,0,0,0,0,0,0,0,
		0,1,1,2,3,0,3,3,3,2,2,2,2,1,0,1,0,1,0,1,2,2,0,0,2,2,1,3,1,1,2,1,
		0,0,1,1,2,0,1,1,0,0,1,2,0,2,1,1,2,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,
		3,3,2,0,0,3,1,0,0,0,0,0,0,3,2,1,2,0,0,1,0,0,2,0,0,0,0,0,2,0,1,0,
		0,2,1,1,0,0,1,0,1,2,0,0,1,1,0,0,2,1,1,1,1,0,2,0,0,0,0,0,0,0,0,0,
		3,3,2,0,0,1,0,0,0,0,1,0,0,3,3,2,2,0,0,1,0,0,2,0,1,0,0,0,2,0,1,0,
		0,0,1,1,0,0,2,0,2,1,0,0,1,1,2,1,2,0,2,1,2,1,1,1,0,0,1,1,0,0,0,0,
		3,3,2,0,0,2,2,0,0,0,1,1,0,2,2,1,3,1,0,1,0,1,2,0,0,0,0,0,1,0,1,0,
		0,1,1,0,0,0,0,0,1,0,0,1,0,0,0,1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,2,0,0,0,1,0,0,1,0,0,2,3,1,2,0,0,1,0,0,2,0,0,0,1,0,2,0,2,0,
		0,1,1,2,2,1,2,0,2,1,1,0,0,1,1,0,1,1,1,1,2,1,1,0,0,0,0,0,0,0,0,0,
		3,3,3,0,2,1,2,1,0,0,1,1,0,3,3,1,2,0,0,1,0,0,2,0,2,0,1,1,2,0,0,0,
		0,0,1,1,1,1,2,0,1,1,0,1,1,1,1,0,0,0,1,1,1,0,1,0,0,0,1,0,0,0,0,0,
		3,3,3,0,2,2,3,2,0,0,1,0,0,2,3,1,0,0,0,0,0,0,2,0,2,0,0,0,2,0,0,0,
		0,1,1,0,0,0,1,0,0,1,0,1,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,
		3,2,3,0,0,0,0,0,0,0,1,0,0,2,2,2,2,0,0,1,0,0,2,0,0,0,0,0,2,0,1,0,
		0,0,2,1,1,0,1,0,2,1,1,0,0,1,1,2,1,0,2,0,2,0,1,0,0,0,2,0,0,0,0,0,
		0,0,0,2,2,0,2,1,1,1,1,2,2,0,0,1,0,1,0,0,1,3,0,0,0,0,1,0,0,2,1,0,
		0,0,1,0,1,0,0,0,0,0,2,1,0,1,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,
		2,0,0,2,3,0,2,3,1,2,2,0,2,0,0,2,0,2,1,1,1,2,1,0,0,1,2,1,1,2,1,0,
		1,0,2,0,1,0,1,1,0,0,2,2,1,2,1,1,2,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,
		3,3,3,0,2,1,2,0,0,0,1,0,0,3,2,0,1,0,0,1,0,0,2,0,0,0,1,2,1,0,1,0,
		0,0,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,
		0,0,0,2,2,0,2,2,1,1,0,1,1,1,1,1,0,0,1,2,1,1,1,0,1,0,0,0,1,1,1,1,
		0,0,2,1,0,1,1,1,0,1,1,2,1,2,1,1,2,0,1,1,2,1,0,2,0,0,0,0,0,0,0,0,
		3,2,2,0,0,2,0,0,0,0,0,0,0,2,2,0,2,0,0,1,0,0,2,0,0,0,0,0,2,0,0,0,
		0,2,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,
		0,0,0,3,2,0,2,2,0,1,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,
		2,0,1,0,1,0,1,1,0,0,1,2,0,1,0,1,1,0,0,1,0,1,0,2,0,0,0,0,0,0,0,0,
		2,2,2,0,1,1,0,0,0,1,0,0,0,1,2,0,1,0,0,1,0,0,1,0,0,0,0,1,2,0,1,0,
		0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0,1,0,2,0,0,0,0,0,0,0,0,0,0,0,
		2,2,2,2,1,0,1,1,1,0,0,0,0,1,2,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,
		1,1,2,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,2,0,0,0,0,0,1,
		0,0,1,2,2,0,2,1,2,1,1,2,2,0,0,0,0,1,0,0,1,1,0,0,2,0,0,0,0,1,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,
		2,2,2,0,0,0,1,0,0,0,0,0,0,2,2,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,
		0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		0,0,0,1,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		2,2,2,0,1,0,1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		0,0,1,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
		0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
	};
}
