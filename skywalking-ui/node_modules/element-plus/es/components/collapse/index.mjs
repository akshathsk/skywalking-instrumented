import '../../utils/index.mjs';
import Collapse from './src/collapse.mjs';
import CollapseItem from './src/collapse-item.mjs';
import { withInstall, withNoopInstall } from '../../utils/vue/install.mjs';

const ElCollapse = withInstall(Collapse, {
  CollapseItem
});
const ElCollapseItem = withNoopInstall(CollapseItem);

export { ElCollapse, ElCollapseItem, ElCollapse as default };
//# sourceMappingURL=index.mjs.map
