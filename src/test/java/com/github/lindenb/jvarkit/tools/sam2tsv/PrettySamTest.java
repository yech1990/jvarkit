package com.github.lindenb.jvarkit.tools.sam2tsv;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.lindenb.jvarkit.tools.tests.TestUtils;

public class PrettySamTest extends TestUtils {
	
	
	@Test(dataProvider="all-one-bam-and-ref")
	public void test01(final String inBam,String inFasta) 
		throws IOException
		{
		final File out = super.createTmpFile(".txt");
		final PrettySam cmd =new PrettySam();
		Assert.assertEquals(cmd.instanceMain(new String[] {
			"-R",inFasta,
			"-o",out.getPath(),
			inBam
			}),0);
		assertIsNotEmpty(out);
		}
}
