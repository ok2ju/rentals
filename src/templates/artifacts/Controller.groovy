@artifact.package@
import grails.transaction.Transactional
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

@Transactional(readOnly = true)
class @artifact.name@ {
	
	private static final Log log = LogFactory.getLog(@artifact.name@.class)
	
    def index() { }
}
