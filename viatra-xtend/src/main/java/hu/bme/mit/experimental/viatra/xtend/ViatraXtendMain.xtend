package hu.bme.mit.experimental.viatra.xtend

import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import hu.bme.mit.trainbenchmark.benchmark.viatra.PosLengthMatch
import hu.bme.mit.trainbenchmark.benchmark.viatra.PosLengthMatcher

class ViatraXtendMain {

    def static void main(String[] args) {
        println("Hello")

        val f = new BatchTransformationRuleFactory
        val rule = f.createRule().precondition(PosLengthMatcher.querySpecification)

    }

}
