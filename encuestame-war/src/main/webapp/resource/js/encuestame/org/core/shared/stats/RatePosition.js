dojo.provide("encuestame.org.core.shared.stats.RatePosition");

dojo.require('dojox.timing');
dojo.require("dojox.widget.Dialog");
dojo.require("dijit._Templated");
dojo.require("dijit._Widget");
dojo.require("dijit.layout.ContentPane");
dojo.require('encuestame.org.core.commons');
dojo.require("encuestame.org.main.EnmeMainLayoutWidget");
dojo.require('encuestame.org.core.commons.stream.HashTagInfo');

dojo.declare(
    "encuestame.org.core.shared.stats.RatePosition",
    [encuestame.org.main.EnmeMainLayoutWidget],{
    /*
     *
     */
    templatePath: dojo.moduleUrl("encuestame.org.core.shared.stats", "templates/position.html"),


    service : encuestame.service.list.rate.profile,


});