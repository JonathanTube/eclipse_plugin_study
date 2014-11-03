package enumgenerator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.part.ViewPart;

public class ViewPart1 extends ViewPart {

	private Group group;
	private Button testButton; // ≤‚ ‘∞¥≈•

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		group = new Group(parent, SWT.BORDER);
		group.setBounds(20, 20, 100, 100);
		group.setText("≤‚ ‘ ”Õº");
		testButton = new Button(group, SWT.PUSH);
		testButton.setText("≤‚ ‘");
		testButton.setBounds(40, 40, 50, 30);
		testButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(null, "joke hello world.",
						"This is a test!");
			}
		});
	}

	@Override
	public void setFocus() {
		testButton.setFocus();
	}
}
