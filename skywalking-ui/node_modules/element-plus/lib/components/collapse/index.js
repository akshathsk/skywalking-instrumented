'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

require('../../utils/index.js');
var collapse = require('./src/collapse.js');
var collapseItem = require('./src/collapse-item.js');
var install = require('../../utils/vue/install.js');

const ElCollapse = install.withInstall(collapse["default"], {
  CollapseItem: collapseItem["default"]
});
const ElCollapseItem = install.withNoopInstall(collapseItem["default"]);

exports.ElCollapse = ElCollapse;
exports.ElCollapseItem = ElCollapseItem;
exports["default"] = ElCollapse;
//# sourceMappingURL=index.js.map
