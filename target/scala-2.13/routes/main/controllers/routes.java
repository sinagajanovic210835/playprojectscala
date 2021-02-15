// @GENERATOR:play-routes-compiler
// @SOURCE:F:/playprojectscala/conf/routes
// @DATE:Sun Feb 14 08:31:00 CET 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBarcodes Barcodes = new controllers.ReverseBarcodes(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProducts Products = new controllers.ReverseProducts(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBarcodes Barcodes = new controllers.javascript.ReverseBarcodes(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProducts Products = new controllers.javascript.ReverseProducts(RoutesPrefix.byNamePrefix());
  }

}
