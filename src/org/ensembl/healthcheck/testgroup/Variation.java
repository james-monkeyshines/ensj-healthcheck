package org.ensembl.healthcheck.testgroup;

import org.ensembl.healthcheck.GroupOfTests;

/**
 * These are the tests that register themselves as variation. The tests are:
 * 
 * <ul>
 *   <li> org.ensembl.healthcheck.testcase.variation.IndividualType </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.AlleleFrequencies </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.VariationSet </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.ForeignKeyCoreId </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.VFCoordinates </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.Meta_coord </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.VariationForeignKeys </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.TranscriptVariation </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.EmptyVariationTables </li>
 *   <li> org.ensembl.healthcheck.testcase.variation.Meta </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.CompressedGenotypeRegion </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.CompareVariationSchema </li> 
 *   <li> org.ensembl.healthcheck.testcase.variation.CheckChar </li> 
 * </ul>
 *
 * @author Autogenerated
 *
 */
public class Variation extends GroupOfTests {
	
	public Variation() {

		addTest(
			org.ensembl.healthcheck.testcase.variation.IndividualType.class,
			org.ensembl.healthcheck.testcase.variation.AlleleFrequencies.class,
			org.ensembl.healthcheck.testcase.variation.VariationSet.class,
			org.ensembl.healthcheck.testcase.variation.ForeignKeyCoreId.class,
			org.ensembl.healthcheck.testcase.variation.VFCoordinates.class,
			org.ensembl.healthcheck.testcase.variation.Meta_coord.class,
			org.ensembl.healthcheck.testcase.variation.VariationForeignKeys.class,
			org.ensembl.healthcheck.testcase.variation.TranscriptVariation.class,
			org.ensembl.healthcheck.testcase.variation.EmptyVariationTables.class,
			org.ensembl.healthcheck.testcase.variation.Meta.class,
			org.ensembl.healthcheck.testcase.variation.CompressedGenotypeRegion.class,
			org.ensembl.healthcheck.testcase.variation.CompareVariationSchema.class,
			org.ensembl.healthcheck.testcase.variation.CheckChar.class
		);
	}
}