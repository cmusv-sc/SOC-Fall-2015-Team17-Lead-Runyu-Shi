// @SOURCE:/Users/zmhbh/Desktop/team/SOC-Fall-2015/ApacheCMDA-Frontend/conf/routes
// @HASH:10578c5ec55619d43877ea896d9e42a6fe544728
// @DATE:Fri Nov 20 11:50:59 EST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers {

// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
class ReverseTagController {
    

// @LINE:45
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:44
def tags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag/tags")
}
                                                

// @LINE:43
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tag" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
}
                                                

// @LINE:18
def aboutUs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "aboutus")
}
                                                
    
}
                          

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:40
def displayWorkflow(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/disWorkflow" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                                                

// @LINE:37
def workflows(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflows")
}
                                                

// @LINE:36
def createWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/createWorkflow")
}
                                                

// @LINE:38
def handleCreateWorkflow(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/workflowCreating")
}
                                                

// @LINE:39
def linkTags(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "workflow/linkTags")
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bugs")
}
                                                

// @LINE:15
def solveReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "solve/report")
}
                                                

// @LINE:14
def deleteReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete/report")
}
                                                

// @LINE:13
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "bug/list")
}
                                                

// @LINE:12
def newReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newReport")
}
                                                
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
class ReverseDatasetController {
    

// @LINE:50
def getSearchResult(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/getSearchResult")
}
                                                

// @LINE:49
def searchDataset(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/searchDataSet")
}
                                                

// @LINE:48
def datasetList(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/datasets")
}
                                                
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:25
def mostRecentlyAddedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyAddedClimateServices")
}
                                                

// @LINE:31
def editClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/edit/climateServices")
}
                                                

// @LINE:27
def mostPopularClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostPopularClimateServices")
}
                                                

// @LINE:23
def tutorial(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/tutorial")
}
                                                

// @LINE:33
def oneService(url:String = null): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/oneService" + queryString(List(if(url == null) None else Some(implicitly[QueryStringBindable[String]].unbind("url", url)))))
}
                                                

// @LINE:30
def downloadClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/download/climateServices")
}
                                                

// @LINE:26
def mostRecentlyUsedClimateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/mostRecentlyUsedClimateServices")
}
                                                

// @LINE:24
def climateServices(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "climate/climateServices")
}
                                                

// @LINE:28
def newClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/new/climateServices")
}
                                                

// @LINE:22
// @LINE:7
// @LINE:6
def home(email:String = null, vfile:String = null, dataset:String = null): Call = {
   (email: @unchecked, vfile: @unchecked, dataset: @unchecked) match {
// @LINE:6
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "home" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:7
case (email, vfile, dataset) if true => Call("GET", _prefix + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
// @LINE:22
case (email, vfile, dataset) if true => Call("GET", _prefix + { _defaultPrefix } + "climate" + queryString(List(if(email == null) None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)), if(vfile == null) None else Some(implicitly[QueryStringBindable[String]].unbind("vfile", vfile)), if(dataset == null) None else Some(implicitly[QueryStringBindable[String]].unbind("dataset", dataset)))))
                                                        
   }
}
                                                

// @LINE:29
def deleteClimateService(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "climate/delete/climateServices")
}
                                                
    
}
                          
}
                  


// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:44
// @LINE:43
class ReverseTagController {
    

// @LINE:45
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:44
def tags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.tags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/tags"})
      }
   """
)
                        

// @LINE:43
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TagController.home",
   """
      function(email,vfile,dataset) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
      }
   """
)
                        

// @LINE:18
def aboutUs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AboutusController.aboutUs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
   """
)
                        
    
}
              

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:40
def displayWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.displayWorkflow",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/disWorkflow" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:37
def workflows : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.workflows",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflows"})
      }
   """
)
                        

// @LINE:36
def createWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.createWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/createWorkflow"})
      }
   """
)
                        

// @LINE:38
def handleCreateWorkflow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.handleCreateWorkflow",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/workflowCreating"})
      }
   """
)
                        

// @LINE:39
def linkTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WorkflowController.linkTags",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "workflow/linkTags"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.reports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugs"})
      }
   """
)
                        

// @LINE:15
def solveReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.solveReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "solve/report"})
      }
   """
)
                        

// @LINE:14
def deleteReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.deleteReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/report"})
      }
   """
)
                        

// @LINE:13
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bug/list"})
      }
   """
)
                        

// @LINE:12
def newReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BugReportController.newReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newReport"})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:49
// @LINE:48
class ReverseDatasetController {
    

// @LINE:50
def getSearchResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.getSearchResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/getSearchResult"})
      }
   """
)
                        

// @LINE:49
def searchDataset : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.searchDataset",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/searchDataSet"})
      }
   """
)
                        

// @LINE:48
def datasetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DatasetController.datasetList",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/datasets"})
      }
   """
)
                        
    
}
              

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.addClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:25
def mostRecentlyAddedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyAddedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyAddedClimateServices"})
      }
   """
)
                        

// @LINE:31
def editClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.editClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/edit/climateServices"})
      }
   """
)
                        

// @LINE:27
def mostPopularClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostPopularClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostPopularClimateServices"})
      }
   """
)
                        

// @LINE:23
def tutorial : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.tutorial",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/tutorial"})
      }
   """
)
                        

// @LINE:33
def oneService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.oneService",
   """
      function(url) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/oneService" + _qS([(url == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("url", url))])})
      }
   """
)
                        

// @LINE:30
def downloadClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.downloadClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/download/climateServices"})
      }
   """
)
                        

// @LINE:26
def mostRecentlyUsedClimateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.mostRecentlyUsedClimateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/mostRecentlyUsedClimateServices"})
      }
   """
)
                        

// @LINE:24
def climateServices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.climateServices",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/climateServices"})
      }
   """
)
                        

// @LINE:28
def newClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.newClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/new/climateServices"})
      }
   """
)
                        

// @LINE:22
// @LINE:7
// @LINE:6
def home : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.home",
   """
      function(email, vfile, dataset) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "climate" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)), (vfile == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("vfile", vfile)), (dataset == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("dataset", dataset))])})
      }
      }
   """
)
                        

// @LINE:29
def deleteClimateService : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ClimateServiceController.deleteClimateService",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "climate/delete/climateServices"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:53
// @LINE:50
// @LINE:49
// @LINE:48
// @LINE:45
// @LINE:44
// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:43
class ReverseTagController {
    

// @LINE:45
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.oneService(url), HandlerDef(this, "controllers.TagController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """tag/oneService""")
)
                      

// @LINE:44
def tags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.tags(), HandlerDef(this, "controllers.TagController", "tags", Seq(), "GET", """""", _prefix + """tag/tags""")
)
                      

// @LINE:43
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TagController.home(email, vfile, dataset), HandlerDef(this, "controllers.TagController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Tag Model""", _prefix + """tag""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
class ReverseAboutusController {
    

// @LINE:19
def aboutProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutProject(), HandlerDef(this, "controllers.AboutusController", "aboutProject", Seq(), "GET", """""", _prefix + """aboutProject""")
)
                      

// @LINE:18
def aboutUs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AboutusController.aboutUs(), HandlerDef(this, "controllers.AboutusController", "aboutUs", Seq(), "GET", """ About Us""", _prefix + """aboutus""")
)
                      
    
}
                          

// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:37
// @LINE:36
class ReverseWorkflowController {
    

// @LINE:40
def displayWorkflow(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.displayWorkflow(id), HandlerDef(this, "controllers.WorkflowController", "displayWorkflow", Seq(classOf[Long]), "GET", """""", _prefix + """workflow/disWorkflow""")
)
                      

// @LINE:37
def workflows(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.workflows(), HandlerDef(this, "controllers.WorkflowController", "workflows", Seq(), "GET", """""", _prefix + """workflows""")
)
                      

// @LINE:36
def createWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.createWorkflow(), HandlerDef(this, "controllers.WorkflowController", "createWorkflow", Seq(), "GET", """Workflow""", _prefix + """workflow/createWorkflow""")
)
                      

// @LINE:38
def handleCreateWorkflow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.handleCreateWorkflow(), HandlerDef(this, "controllers.WorkflowController", "handleCreateWorkflow", Seq(), "GET", """""", _prefix + """workflow/workflowCreating""")
)
                      

// @LINE:39
def linkTags(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WorkflowController.linkTags(), HandlerDef(this, "controllers.WorkflowController", "linkTags", Seq(), "GET", """""", _prefix + """workflow/linkTags""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
class ReverseBugReportController {
    

// @LINE:11
def reports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.reports(), HandlerDef(this, "controllers.BugReportController", "reports", Seq(), "GET", """ BugReporting""", _prefix + """bugs""")
)
                      

// @LINE:15
def solveReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.solveReport(), HandlerDef(this, "controllers.BugReportController", "solveReport", Seq(), "POST", """""", _prefix + """solve/report""")
)
                      

// @LINE:14
def deleteReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.deleteReport(), HandlerDef(this, "controllers.BugReportController", "deleteReport", Seq(), "POST", """""", _prefix + """delete/report""")
)
                      

// @LINE:13
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.list(), HandlerDef(this, "controllers.BugReportController", "list", Seq(), "GET", """""", _prefix + """bug/list""")
)
                      

// @LINE:12
def newReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BugReportController.newReport(), HandlerDef(this, "controllers.BugReportController", "newReport", Seq(), "GET", """""", _prefix + """newReport""")
)
                      
    
}
                          

// @LINE:50
// @LINE:49
// @LINE:48
class ReverseDatasetController {
    

// @LINE:50
def getSearchResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.getSearchResult(), HandlerDef(this, "controllers.DatasetController", "getSearchResult", Seq(), "GET", """""", _prefix + """climate/getSearchResult""")
)
                      

// @LINE:49
def searchDataset(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.searchDataset(), HandlerDef(this, "controllers.DatasetController", "searchDataset", Seq(), "GET", """""", _prefix + """climate/searchDataSet""")
)
                      

// @LINE:48
def datasetList(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DatasetController.datasetList(), HandlerDef(this, "controllers.DatasetController", "datasetList", Seq(), "GET", """Keyword search""", _prefix + """climate/datasets""")
)
                      
    
}
                          

// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:7
// @LINE:6
class ReverseClimateServiceController {
    

// @LINE:32
def addClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.addClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "addClimateServices", Seq(), "GET", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:25
def mostRecentlyAddedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyAddedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyAddedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyAddedClimateServices""")
)
                      

// @LINE:31
def editClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.editClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "editClimateService", Seq(), "POST", """""", _prefix + """climate/edit/climateServices""")
)
                      

// @LINE:27
def mostPopularClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostPopularClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostPopularClimateServices", Seq(), "GET", """""", _prefix + """climate/mostPopularClimateServices""")
)
                      

// @LINE:23
def tutorial(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.tutorial(), HandlerDef(this, "controllers.ClimateServiceController", "tutorial", Seq(), "GET", """""", _prefix + """climate/tutorial""")
)
                      

// @LINE:33
def oneService(url:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.oneService(url), HandlerDef(this, "controllers.ClimateServiceController", "oneService", Seq(classOf[String]), "GET", """""", _prefix + """climate/oneService""")
)
                      

// @LINE:30
def downloadClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.downloadClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "downloadClimateService", Seq(), "POST", """""", _prefix + """climate/download/climateServices""")
)
                      

// @LINE:26
def mostRecentlyUsedClimateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.mostRecentlyUsedClimateServices(), HandlerDef(this, "controllers.ClimateServiceController", "mostRecentlyUsedClimateServices", Seq(), "GET", """""", _prefix + """climate/mostRecentlyUsedClimateServices""")
)
                      

// @LINE:24
def climateServices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.climateServices(), HandlerDef(this, "controllers.ClimateServiceController", "climateServices", Seq(), "GET", """""", _prefix + """climate/climateServices""")
)
                      

// @LINE:28
def newClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.newClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "newClimateService", Seq(), "POST", """""", _prefix + """climate/new/climateServices""")
)
                      

// @LINE:6
def home(email:String, vfile:String, dataset:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.home(email, vfile, dataset), HandlerDef(this, "controllers.ClimateServiceController", "home", Seq(classOf[String], classOf[String], classOf[String]), "GET", """ Home page""", _prefix + """home""")
)
                      

// @LINE:29
def deleteClimateService(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ClimateServiceController.deleteClimateService(), HandlerDef(this, "controllers.ClimateServiceController", "deleteClimateService", Seq(), "POST", """""", _prefix + """climate/delete/climateServices""")
)
                      
    
}
                          
}
        
    