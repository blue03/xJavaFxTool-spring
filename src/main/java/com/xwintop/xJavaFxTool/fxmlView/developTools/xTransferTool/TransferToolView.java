package com.xwintop.xJavaFxTool.fxmlView.developTools.xTransferTool;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Lazy
@FXMLView(value = "/com/xwintop/xJavaFxTool/fxmlView/developTools/xTransferTool/TransferTool.fxml")
public class TransferToolView extends AbstractFxmlView {
}
