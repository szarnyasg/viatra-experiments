import hu.bme.mit.trainbenchmark.benchmark.viatra.PosLengthMatch
import hu.bme.mit.trainbenchmark.benchmark.viatra.PosLengthMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory

fun main(args: Array<String>) {

    val f = BatchTransformationRuleFactory()
//    val rule_does_not_compile = f.createRule().precondition(PosLengthMatcher.querySpecification())
    val rule = f.createRule<PosLengthMatch, PosLengthMatcher>().precondition(PosLengthMatcher.querySpecification())

}
