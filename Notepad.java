package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class Notepad extends JFrame {
	@SuppressWarnings("null")
	public MenuDemo() {
		setTitle("Notepad");
		JFrame frame;
		JTextArea textArea = new JTextArea(100, 100);
		add(textArea);
		
		JScrollPane scrollText = new JScrollPane(textArea);
		add(scrollText);

		// Menu bar
		JMenuBar jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		// File Menu
		JMenu fileMenu = new JMenu("File");
		jMenuBar.add(fileMenu);
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileMenu.add(newMenuItem);
		JMenuItem openMenuItem = new JMenuItem("Open...");
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileMenu.add(openMenuItem);
		JMenuItem saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileMenu.add(saveMenuItem);
		JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
		fileMenu.add(saveAsMenuItem);
		JMenuItem pageSetupMenuItem = new JMenuItem("Page Setup...");
		fileMenu.add(pageSetupMenuItem);
		JMenuItem printMenuItem = new JMenuItem("Print...");
		printMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		fileMenu.add(printMenuItem);
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(exitMenuItem);
		exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}

		});
		// Edit Menu
		JMenu editMenu = new JMenu("Edit");
		jMenuBar.add(editMenu);
		JMenuItem undoMenuItem = new JMenuItem("Undo");
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		editMenu.add(undoMenuItem);
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		editMenu.add(cutMenuItem);
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		editMenu.add(copyMenuItem);
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		editMenu.add(pasteMenuItem);
		JMenuItem deleteMenuItem = new JMenuItem("Delete");
		editMenu.add(deleteMenuItem);
		JMenuItem findMenuItem = new JMenuItem("Find...");
		findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		editMenu.add(findMenuItem);
		JMenuItem findNextMenuItem = new JMenuItem("Find Next");
		findNextMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.CTRL_MASK));
		editMenu.add(findNextMenuItem);
		JMenuItem replaceMenuItem = new JMenuItem("Replace...");
		replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		editMenu.add(replaceMenuItem);
		JMenuItem gotoMenuItem = new JMenuItem("Go To...");
		gotoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		editMenu.add(gotoMenuItem);
		JMenuItem selectAllMenuItem = new JMenuItem("Select All");
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		editMenu.add(selectAllMenuItem);
		JMenuItem TimeDateMenuItem = new JMenuItem("Time/Date");
		TimeDateMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, ActionEvent.CTRL_MASK));
		editMenu.add(TimeDateMenuItem);

		// Format Menu
		JMenu formatMenu = new JMenu("Format");
		jMenuBar.add(formatMenu);
		JMenuItem wordWrapMenuItem = new JMenuItem("Word Wrap");
		formatMenu.add(wordWrapMenuItem);
		JMenuItem fontMenuItem = new JMenuItem("Font...");
		formatMenu.add(fontMenuItem);
		// View Menu
		JMenu viewMenu = new JMenu("View");
		jMenuBar.add(viewMenu);
		JMenuItem statusBarMenuItem = new JMenuItem("Status Bar");
		viewMenu.add(statusBarMenuItem);
		// Help Menu
		JMenu helpMenu = new JMenu("Help");
		jMenuBar.add(helpMenu);
		JMenuItem helpMenuItem = new JMenuItem("View Help");
		helpMenu.add(helpMenuItem);
		JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");
		helpMenu.add(aboutNotepadMenuItem);

		
		// TextArea
		
	
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(550, 700);
		setVisible(true);
		

	}

	public static void main(String[] args) throws Exception {

		new MenuDemo();

	}

}
