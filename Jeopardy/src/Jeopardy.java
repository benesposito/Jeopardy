import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Jeopardy
{
	JFrame mainFrame = new JFrame("Jeopardy");
	
	JPanel mainPanel;
	JPanel questionsPanel = new JPanel();
	JPanel infoLeftPanel = new JPanel();
	JPanel infoRightPanel = new JPanel();
	JPanel infoPanel = new JPanel();
	JPanel settingsMainPanel = new JPanel();
	
	JPanel cat1Panel = new JPanel();
	JPanel cat2Panel = new JPanel();
	JPanel cat3Panel = new JPanel();
	JPanel cat4Panel = new JPanel();
	JPanel cat5Panel = new JPanel();
	
	JPanel points11Panel = new JPanel();
	JPanel points12Panel = new JPanel();
	JPanel points13Panel = new JPanel();
	JPanel points14Panel = new JPanel();
	JPanel points15Panel = new JPanel();

	JPanel points21Panel = new JPanel();
	JPanel points22Panel = new JPanel();
	JPanel points23Panel = new JPanel();
	JPanel points24Panel = new JPanel();
	JPanel points25Panel = new JPanel();

	JPanel points31Panel = new JPanel();
	JPanel points32Panel = new JPanel();
	JPanel points33Panel = new JPanel();
	JPanel points34Panel = new JPanel();
	JPanel points35Panel = new JPanel();

	JPanel points41Panel = new JPanel();
	JPanel points42Panel = new JPanel();
	JPanel points43Panel = new JPanel();
	JPanel points44Panel = new JPanel();
	JPanel points45Panel = new JPanel();

	JPanel points51Panel = new JPanel();
	JPanel points52Panel = new JPanel();
	JPanel points53Panel = new JPanel();
	JPanel points54Panel = new JPanel();
	JPanel points55Panel = new JPanel();
	
	JPanel addPoints11Panel = new JPanel();
	JPanel addPoints12Panel = new JPanel();
	JPanel addPoints13Panel = new JPanel();
	JPanel addPoints14Panel = new JPanel();
	JPanel addPoints15Panel = new JPanel();

	JPanel addPoints21Panel = new JPanel();
	JPanel addPoints22Panel = new JPanel();
	JPanel addPoints23Panel = new JPanel();
	JPanel addPoints24Panel = new JPanel();
	JPanel addPoints25Panel = new JPanel();

	JPanel addPoints31Panel = new JPanel();
	JPanel addPoints32Panel = new JPanel();
	JPanel addPoints33Panel = new JPanel();
	JPanel addPoints34Panel = new JPanel();
	JPanel addPoints35Panel = new JPanel();

	JPanel addPoints41Panel = new JPanel();
	JPanel addPoints42Panel = new JPanel();
	JPanel addPoints43Panel = new JPanel();
	JPanel addPoints44Panel = new JPanel();
	JPanel addPoints45Panel = new JPanel();

	JPanel addPoints51Panel = new JPanel();
	JPanel addPoints52Panel = new JPanel();
	JPanel addPoints53Panel = new JPanel();
	JPanel addPoints54Panel = new JPanel();
	JPanel addPoints55Panel = new JPanel();
	
	JButton settingsB = new JButton("Settings");
	
	static JButton cat1 = new JButton("Category 1");
	static JButton cat2 = new JButton("Category 2");
	static JButton cat3 = new JButton("Category 3");
	static JButton cat4 = new JButton("Category 4");
	static JButton cat5 = new JButton("Category 5");
	
	static JButton cat1Done = new JButton("Done");
	static JButton cat2Done = new JButton("Done");
	static JButton cat3Done = new JButton("Done");
	static JButton cat4Done = new JButton("Done");
	static JButton cat5Done = new JButton("Done");
	
	static JButton points11B = new JButton();
	static JButton points12B = new JButton();
	static JButton points13B = new JButton();
	static JButton points14B = new JButton();
	static JButton points15B = new JButton();

	static JButton points21B = new JButton();
	static JButton points22B = new JButton();
	static JButton points23B = new JButton();
	static JButton points24B = new JButton();
	static JButton points25B = new JButton();

	static JButton points31B = new JButton();
	static JButton points32B = new JButton();
	static JButton points33B = new JButton();
	static JButton points34B = new JButton();
	static JButton points35B = new JButton();

	static JButton points41B = new JButton();
	static JButton points42B = new JButton();
	static JButton points43B = new JButton();
	static JButton points44B = new JButton();
	static JButton points45B = new JButton();

	static JButton points51B = new JButton();
	static JButton points52B = new JButton();
	static JButton points53B = new JButton();
	static JButton points54B = new JButton();
	static JButton points55B = new JButton();
	
	static JLabel team1 = new JLabel("Team 1");
	static JLabel team2 = new JLabel("Team 2");
	static JLabel team1PointsL = new JLabel();
	static JLabel team2PointsL = new JLabel();

	static JLabel dummy = new JLabel("                ");
	
	JLabel cat1LSettings = new JLabel();
	JLabel cat2LSettings = new JLabel();
	JLabel cat3LSettings = new JLabel();
	JLabel cat4LSettings = new JLabel();
	JLabel cat5LSettings = new JLabel();
	
	static JTextField cat1TF = new JTextField(15);
	static JTextField cat2TF = new JTextField();
	static JTextField cat3TF = new JTextField();
	static JTextField cat4TF = new JTextField();
	static JTextField cat5TF = new JTextField();
	
	JButton apply = new JButton("Apply");

	JButton addTeam1Points11 = new JButton("Team 1");
	JButton addTeam1Points12 = new JButton("Team 1");
	JButton addTeam1Points13 = new JButton("Team 1");
	JButton addTeam1Points14 = new JButton("Team 1");
	JButton addTeam1Points15 = new JButton("Team 1");

	JButton addTeam1Points21 = new JButton("Team 1");
	JButton addTeam1Points22 = new JButton("Team 1");
	JButton addTeam1Points23 = new JButton("Team 1");
	JButton addTeam1Points24 = new JButton("Team 1");
	JButton addTeam1Points25 = new JButton("Team 1");

	JButton addTeam1Points31 = new JButton("Team 1");
	JButton addTeam1Points32 = new JButton("Team 1");
	JButton addTeam1Points33 = new JButton("Team 1");
	JButton addTeam1Points34 = new JButton("Team 1");
	JButton addTeam1Points35 = new JButton("Team 1");

	JButton addTeam1Points41 = new JButton("Team 1");
	JButton addTeam1Points42 = new JButton("Team 1");
	JButton addTeam1Points43 = new JButton("Team 1");
	JButton addTeam1Points44 = new JButton("Team 1");
	JButton addTeam1Points45 = new JButton("Team 1");

	JButton addTeam1Points51 = new JButton("Team 1");
	JButton addTeam1Points52 = new JButton("Team 1");
	JButton addTeam1Points53 = new JButton("Team 1");
	JButton addTeam1Points54 = new JButton("Team 1");
	JButton addTeam1Points55 = new JButton("Team 1");
	
	JButton addTeam2Points11 = new JButton("Team 2");
	JButton addTeam2Points12 = new JButton("Team 2");
	JButton addTeam2Points13 = new JButton("Team 2");
	JButton addTeam2Points14 = new JButton("Team 2");
	JButton addTeam2Points15 = new JButton("Team 2");

	JButton addTeam2Points21 = new JButton("Team 2");
	JButton addTeam2Points22 = new JButton("Team 2");
	JButton addTeam2Points23 = new JButton("Team 2");
	JButton addTeam2Points24 = new JButton("Team 2");
	JButton addTeam2Points25 = new JButton("Team 2");

	JButton addTeam2Points31 = new JButton("Team 2");
	JButton addTeam2Points32 = new JButton("Team 2");
	JButton addTeam2Points33 = new JButton("Team 2");
	JButton addTeam2Points34 = new JButton("Team 2");
	JButton addTeam2Points35 = new JButton("Team 2");

	JButton addTeam2Points41 = new JButton("Team 2");
	JButton addTeam2Points42 = new JButton("Team 2");
	JButton addTeam2Points43 = new JButton("Team 2");
	JButton addTeam2Points44 = new JButton("Team 2");
	JButton addTeam2Points45 = new JButton("Team 2");

	JButton addTeam2Points51 = new JButton("Team 2");
	JButton addTeam2Points52 = new JButton("Team 2");
	JButton addTeam2Points53 = new JButton("Team 2");
	JButton addTeam2Points54 = new JButton("Team 2");
	JButton addTeam2Points55 = new JButton("Team 2");
	
	JButton neither11 = new JButton("Neither");
	JButton neither12 = new JButton("Neither");
	JButton neither13 = new JButton("Neither");
	JButton neither14 = new JButton("Neither");
	JButton neither15 = new JButton("Neither");

	JButton neither21 = new JButton("Neither");
	JButton neither22 = new JButton("Neither");
	JButton neither23 = new JButton("Neither");
	JButton neither24 = new JButton("Neither");
	JButton neither25 = new JButton("Neither");

	JButton neither31 = new JButton("Neither");
	JButton neither32 = new JButton("Neither");
	JButton neither33 = new JButton("Neither");
	JButton neither34 = new JButton("Neither");
	JButton neither35 = new JButton("Neither");

	JButton neither41 = new JButton("Neither");
	JButton neither42 = new JButton("Neither");
	JButton neither43 = new JButton("Neither");
	JButton neither44 = new JButton("Neither");
	JButton neither45 = new JButton("Neither");
	
	JButton neither51 = new JButton("Neither");
	JButton neither52 = new JButton("Neither");
	JButton neither53 = new JButton("Neither");
	JButton neither54 = new JButton("Neither");
	JButton neither55 = new JButton("Neither");
	
	JButton showAnswer11 = new JButton("Show Answer");
	JButton showAnswer12 = new JButton("Show Answer");
	JButton showAnswer13 = new JButton("Show Answer");
	JButton showAnswer14 = new JButton("Show Answer");
	JButton showAnswer15 = new JButton("Show Answer");

	JButton showAnswer21 = new JButton("Show Answer");
	JButton showAnswer22 = new JButton("Show Answer");
	JButton showAnswer23 = new JButton("Show Answer");
	JButton showAnswer24 = new JButton("Show Answer");
	JButton showAnswer25 = new JButton("Show Answer");

	JButton showAnswer31 = new JButton("Show Answer");
	JButton showAnswer32 = new JButton("Show Answer");
	JButton showAnswer33 = new JButton("Show Answer");
	JButton showAnswer34 = new JButton("Show Answer");
	JButton showAnswer35 = new JButton("Show Answer");

	JButton showAnswer41 = new JButton("Show Answer");
	JButton showAnswer42 = new JButton("Show Answer");
	JButton showAnswer43 = new JButton("Show Answer");
	JButton showAnswer44 = new JButton("Show Answer");
	JButton showAnswer45 = new JButton("Show Answer");

	JButton showAnswer51 = new JButton("Show Answer");
	JButton showAnswer52 = new JButton("Show Answer");
	JButton showAnswer53 = new JButton("Show Answer");
	JButton showAnswer54 = new JButton("Show Answer");
	JButton showAnswer55 = new JButton("Show Answer");
	
	static JLabel question11 = new JLabel();
	static JLabel question12 = new JLabel();
	static JLabel question13 = new JLabel();
	static JLabel question14 = new JLabel();
	static JLabel question15 = new JLabel();

	static JLabel question21 = new JLabel();
	static JLabel question22 = new JLabel();
	static JLabel question23 = new JLabel();
	static JLabel question24 = new JLabel();
	static JLabel question25 = new JLabel();

	static JLabel question31 = new JLabel();
	static JLabel question32 = new JLabel();
	static JLabel question33 = new JLabel();
	static JLabel question34 = new JLabel();
	static JLabel question35 = new JLabel();

	static JLabel question41 = new JLabel();
	static JLabel question42 = new JLabel();
	static JLabel question43 = new JLabel();
	static JLabel question44 = new JLabel();
	static JLabel question45 = new JLabel();

	static JLabel question51 = new JLabel();
	static JLabel question52 = new JLabel();
	static JLabel question53 = new JLabel();
	static JLabel question54 = new JLabel();
	static JLabel question55 = new JLabel();
	
	static JLabel answer11 = new JLabel();
	static JLabel answer12 = new JLabel();
	static JLabel answer13 = new JLabel();
	static JLabel answer14 = new JLabel();
	static JLabel answer15 = new JLabel();

	static JLabel answer21 = new JLabel();
	static JLabel answer22 = new JLabel();
	static JLabel answer23 = new JLabel();
	static JLabel answer24 = new JLabel();
	static JLabel answer25 = new JLabel();

	static JLabel answer31 = new JLabel();
	static JLabel answer32 = new JLabel();
	static JLabel answer33 = new JLabel();
	static JLabel answer34 = new JLabel();
	static JLabel answer35 = new JLabel();

	static JLabel answer41 = new JLabel();
	static JLabel answer42 = new JLabel();
	static JLabel answer43 = new JLabel();
	static JLabel answer44 = new JLabel();
	static JLabel answer45 = new JLabel();

	static JLabel answer51 = new JLabel();
	static JLabel answer52 = new JLabel();
	static JLabel answer53 = new JLabel();
	static JLabel answer54 = new JLabel();
	static JLabel answer55 = new JLabel();
	
	static JLabel FilesLocationL = new JLabel("Files Folder Location:");
	static JTextField FilesLocationTF = new JTextField(30);
	
	static String[][] data = new String[6][5];
	
	GridLayout questionsLayout = new GridLayout(6, 5);
	GridLayout settingsLayout = new GridLayout(3, 2);
	BorderLayout mainLayout = new BorderLayout();
	GridLayout infoSideLayout = new GridLayout(2, 1);
	FlowLayout infoLayout = new FlowLayout();
	GridLayout addPointsLayout = new GridLayout(1, 3);

	BorderLayout pointsLayout11 = new BorderLayout();
	BorderLayout pointsLayout12 = new BorderLayout();
	BorderLayout pointsLayout13 = new BorderLayout();
	BorderLayout pointsLayout14 = new BorderLayout();
	BorderLayout pointsLayout15 = new BorderLayout();

	BorderLayout pointsLayout21 = new BorderLayout();
	BorderLayout pointsLayout22 = new BorderLayout();
	BorderLayout pointsLayout23 = new BorderLayout();
	BorderLayout pointsLayout24 = new BorderLayout();
	BorderLayout pointsLayout25 = new BorderLayout();

	BorderLayout pointsLayout31 = new BorderLayout();
	BorderLayout pointsLayout32 = new BorderLayout();
	BorderLayout pointsLayout33 = new BorderLayout();
	BorderLayout pointsLayout34 = new BorderLayout();
	BorderLayout pointsLayout35 = new BorderLayout();

	BorderLayout pointsLayout41 = new BorderLayout();
	BorderLayout pointsLayout42 = new BorderLayout();
	BorderLayout pointsLayout43 = new BorderLayout();
	BorderLayout pointsLayout44 = new BorderLayout();
	BorderLayout pointsLayout45 = new BorderLayout();

	BorderLayout pointsLayout51 = new BorderLayout();
	BorderLayout pointsLayout52 = new BorderLayout();
	BorderLayout pointsLayout53 = new BorderLayout();
	BorderLayout pointsLayout54 = new BorderLayout();
	BorderLayout pointsLayout55 = new BorderLayout();
	
	BorderLayout cat1Layout = new BorderLayout();
	BorderLayout cat2Layout = new BorderLayout();
	BorderLayout cat3Layout = new BorderLayout();
	BorderLayout cat4Layout = new BorderLayout();
	BorderLayout cat5Layout = new BorderLayout();
	
	static int team1PointsI = 0;
	static int team2PointsI = 0;
	static int questionPoints;
	static String FilesLocation;
	
	static String[][] answers = new String[5][5];
	
	public static void main(String[] args)
	{
		team1PointsL.setHorizontalAlignment(SwingConstants.CENTER);
		team2PointsL.setHorizontalAlignment(SwingConstants.CENTER);
		
		question11.setHorizontalAlignment(SwingConstants.CENTER);
		question12.setHorizontalAlignment(SwingConstants.CENTER);
		question13.setHorizontalAlignment(SwingConstants.CENTER);
		question14.setHorizontalAlignment(SwingConstants.CENTER);
		question15.setHorizontalAlignment(SwingConstants.CENTER);

		question21.setHorizontalAlignment(SwingConstants.CENTER);
		question22.setHorizontalAlignment(SwingConstants.CENTER);
		question23.setHorizontalAlignment(SwingConstants.CENTER);
		question24.setHorizontalAlignment(SwingConstants.CENTER);
		question25.setHorizontalAlignment(SwingConstants.CENTER);

		question31.setHorizontalAlignment(SwingConstants.CENTER);
		question32.setHorizontalAlignment(SwingConstants.CENTER);
		question33.setHorizontalAlignment(SwingConstants.CENTER);
		question34.setHorizontalAlignment(SwingConstants.CENTER);
		question35.setHorizontalAlignment(SwingConstants.CENTER);

		question41.setHorizontalAlignment(SwingConstants.CENTER);
		question42.setHorizontalAlignment(SwingConstants.CENTER);
		question43.setHorizontalAlignment(SwingConstants.CENTER);
		question44.setHorizontalAlignment(SwingConstants.CENTER);
		question45.setHorizontalAlignment(SwingConstants.CENTER);

		question51.setHorizontalAlignment(SwingConstants.CENTER);
		question52.setHorizontalAlignment(SwingConstants.CENTER);
		question53.setHorizontalAlignment(SwingConstants.CENTER);
		question54.setHorizontalAlignment(SwingConstants.CENTER);
		question55.setHorizontalAlignment(SwingConstants.CENTER);
		
		answer11.setHorizontalAlignment(SwingConstants.CENTER);
		answer12.setHorizontalAlignment(SwingConstants.CENTER);
		answer13.setHorizontalAlignment(SwingConstants.CENTER);
		answer14.setHorizontalAlignment(SwingConstants.CENTER);
		answer15.setHorizontalAlignment(SwingConstants.CENTER);

		answer21.setHorizontalAlignment(SwingConstants.CENTER);
		answer22.setHorizontalAlignment(SwingConstants.CENTER);
		answer23.setHorizontalAlignment(SwingConstants.CENTER);
		answer24.setHorizontalAlignment(SwingConstants.CENTER);
		answer25.setHorizontalAlignment(SwingConstants.CENTER);

		answer31.setHorizontalAlignment(SwingConstants.CENTER);
		answer32.setHorizontalAlignment(SwingConstants.CENTER);
		answer33.setHorizontalAlignment(SwingConstants.CENTER);
		answer34.setHorizontalAlignment(SwingConstants.CENTER);
		answer35.setHorizontalAlignment(SwingConstants.CENTER);

		answer41.setHorizontalAlignment(SwingConstants.CENTER);
		answer42.setHorizontalAlignment(SwingConstants.CENTER);
		answer43.setHorizontalAlignment(SwingConstants.CENTER);
		answer44.setHorizontalAlignment(SwingConstants.CENTER);
		answer45.setHorizontalAlignment(SwingConstants.CENTER);

		answer51.setHorizontalAlignment(SwingConstants.CENTER);
		answer52.setHorizontalAlignment(SwingConstants.CENTER);
		answer53.setHorizontalAlignment(SwingConstants.CENTER);
		answer54.setHorizontalAlignment(SwingConstants.CENTER);
		answer55.setHorizontalAlignment(SwingConstants.CENTER);
		
		defaultSetData();
		
		getPrevLocation();
		
		setQuestions();
		
		setAnswers();
		
		setFont();
		
		new Jeopardy();
	}
	
	public Jeopardy()
	{
		mainPanel = new JPanel(mainLayout);
		
		team1PointsL.setText(Integer.toString(team1PointsI));
		team2PointsL.setText(Integer.toString(team2PointsI));
		
		ListenForSubmit lForSubmit = new ListenForSubmit();
		
		mainFrame.setVisible(true);
		mainFrame.setSize(1280, 720);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(true);
		mainFrame.add(mainPanel);
		mainPanel.add(questionsPanel, mainLayout.CENTER);
		mainPanel.add(infoPanel, mainLayout.SOUTH);
		mainPanel.add(settingsB, mainLayout.NORTH);
		
		questionsPanel.setLayout(questionsLayout);
		settingsMainPanel.setLayout(settingsLayout);
		infoLeftPanel.setLayout(infoSideLayout);
		infoRightPanel.setLayout(infoSideLayout);
		infoPanel.setLayout(infoLayout);
		
		points11Panel.setLayout(pointsLayout11);
		points12Panel.setLayout(pointsLayout12);
		points13Panel.setLayout(pointsLayout13);
		points14Panel.setLayout(pointsLayout14);
		points15Panel.setLayout(pointsLayout15);

		points21Panel.setLayout(pointsLayout21);
		points22Panel.setLayout(pointsLayout22);
		points23Panel.setLayout(pointsLayout23);
		points24Panel.setLayout(pointsLayout24);
		points25Panel.setLayout(pointsLayout25);

		points31Panel.setLayout(pointsLayout31);
		points32Panel.setLayout(pointsLayout32);
		points33Panel.setLayout(pointsLayout33);
		points34Panel.setLayout(pointsLayout34);
		points35Panel.setLayout(pointsLayout35);

		points41Panel.setLayout(pointsLayout41);
		points42Panel.setLayout(pointsLayout42);
		points43Panel.setLayout(pointsLayout43);
		points44Panel.setLayout(pointsLayout44);
		points45Panel.setLayout(pointsLayout45);

		points51Panel.setLayout(pointsLayout51);
		points52Panel.setLayout(pointsLayout52);
		points53Panel.setLayout(pointsLayout53);
		points54Panel.setLayout(pointsLayout54);
		points55Panel.setLayout(pointsLayout55);
		
		addPoints11Panel.setLayout(addPointsLayout);
		addPoints12Panel.setLayout(addPointsLayout);
		addPoints13Panel.setLayout(addPointsLayout);
		addPoints14Panel.setLayout(addPointsLayout);
		addPoints15Panel.setLayout(addPointsLayout);

		addPoints21Panel.setLayout(addPointsLayout);
		addPoints22Panel.setLayout(addPointsLayout);
		addPoints23Panel.setLayout(addPointsLayout);
		addPoints24Panel.setLayout(addPointsLayout);
		addPoints25Panel.setLayout(addPointsLayout);

		addPoints31Panel.setLayout(addPointsLayout);
		addPoints32Panel.setLayout(addPointsLayout);
		addPoints33Panel.setLayout(addPointsLayout);
		addPoints34Panel.setLayout(addPointsLayout);
		addPoints35Panel.setLayout(addPointsLayout);

		addPoints41Panel.setLayout(addPointsLayout);
		addPoints42Panel.setLayout(addPointsLayout);
		addPoints43Panel.setLayout(addPointsLayout);
		addPoints44Panel.setLayout(addPointsLayout);
		addPoints45Panel.setLayout(addPointsLayout);

		addPoints51Panel.setLayout(addPointsLayout);
		addPoints52Panel.setLayout(addPointsLayout);
		addPoints53Panel.setLayout(addPointsLayout);
		addPoints54Panel.setLayout(addPointsLayout);
		addPoints55Panel.setLayout(addPointsLayout);
		
		cat1Panel.setLayout(cat1Layout);
		cat2Panel.setLayout(cat2Layout);
		cat3Panel.setLayout(cat3Layout);
		cat4Panel.setLayout(cat4Layout);
		cat5Panel.setLayout(cat5Layout);
		
		questionsPanel.add(cat1);
		questionsPanel.add(cat2);
		questionsPanel.add(cat3);
		questionsPanel.add(cat4);
		questionsPanel.add(cat5);

		questionsPanel.add(points11B);
		questionsPanel.add(points12B);
		questionsPanel.add(points13B);
		questionsPanel.add(points14B);
		questionsPanel.add(points15B);

		questionsPanel.add(points21B);
		questionsPanel.add(points22B);
		questionsPanel.add(points23B);
		questionsPanel.add(points24B);
		questionsPanel.add(points25B);

		questionsPanel.add(points31B);
		questionsPanel.add(points32B);
		questionsPanel.add(points33B);
		questionsPanel.add(points34B);
		questionsPanel.add(points35B);

		questionsPanel.add(points41B);
		questionsPanel.add(points42B);
		questionsPanel.add(points43B);
		questionsPanel.add(points44B);
		questionsPanel.add(points45B);

		questionsPanel.add(points51B);
		questionsPanel.add(points52B);
		questionsPanel.add(points53B);
		questionsPanel.add(points54B);
		questionsPanel.add(points55B);
		
		infoLeftPanel.add(team1);
		infoLeftPanel.add(team1PointsL);
		
		infoRightPanel.add(team2);
		infoRightPanel.add(team2PointsL);
		
		infoPanel.add(infoLeftPanel, infoLayout.LEFT);
		infoPanel.add(dummy, infoLayout.CENTER);
		infoPanel.add(infoRightPanel, infoLayout.RIGHT);
		
		settingsMainPanel.add(FilesLocationL);
		settingsMainPanel.add(FilesLocationTF);
		settingsMainPanel.add(apply);
		
		addPoints11Panel.add(addTeam1Points11);
		addPoints12Panel.add(addTeam1Points12);
		addPoints13Panel.add(addTeam1Points13);
		addPoints14Panel.add(addTeam1Points14);
		addPoints15Panel.add(addTeam1Points15);

		addPoints21Panel.add(addTeam1Points21);
		addPoints22Panel.add(addTeam1Points22);
		addPoints23Panel.add(addTeam1Points23);
		addPoints24Panel.add(addTeam1Points24);
		addPoints25Panel.add(addTeam1Points25);

		addPoints31Panel.add(addTeam1Points31);
		addPoints32Panel.add(addTeam1Points32);
		addPoints33Panel.add(addTeam1Points33);
		addPoints34Panel.add(addTeam1Points34);
		addPoints35Panel.add(addTeam1Points35);

		addPoints41Panel.add(addTeam1Points41);
		addPoints42Panel.add(addTeam1Points42);
		addPoints43Panel.add(addTeam1Points43);
		addPoints44Panel.add(addTeam1Points44);
		addPoints45Panel.add(addTeam1Points45);

		addPoints51Panel.add(addTeam1Points51);
		addPoints52Panel.add(addTeam1Points52);
		addPoints53Panel.add(addTeam1Points53);
		addPoints54Panel.add(addTeam1Points54);
		addPoints55Panel.add(addTeam1Points55);
		
		addPoints11Panel.add(showAnswer11);
		addPoints12Panel.add(showAnswer12);
		addPoints13Panel.add(showAnswer13);
		addPoints14Panel.add(showAnswer14);
		addPoints15Panel.add(showAnswer15);

		addPoints21Panel.add(showAnswer21);
		addPoints22Panel.add(showAnswer22);
		addPoints23Panel.add(showAnswer23);
		addPoints24Panel.add(showAnswer24);
		addPoints25Panel.add(showAnswer25);

		addPoints31Panel.add(showAnswer31);
		addPoints32Panel.add(showAnswer32);
		addPoints33Panel.add(showAnswer33);
		addPoints34Panel.add(showAnswer34);
		addPoints35Panel.add(showAnswer35);

		addPoints41Panel.add(showAnswer41);
		addPoints42Panel.add(showAnswer42);
		addPoints43Panel.add(showAnswer43);
		addPoints44Panel.add(showAnswer44);
		addPoints45Panel.add(showAnswer45);
		
		addPoints51Panel.add(showAnswer51);
		addPoints52Panel.add(showAnswer52);
		addPoints53Panel.add(showAnswer53);
		addPoints54Panel.add(showAnswer54);
		addPoints55Panel.add(showAnswer55);
		
		addPoints11Panel.add(addTeam2Points11);
		addPoints12Panel.add(addTeam2Points12);
		addPoints13Panel.add(addTeam2Points13);
		addPoints14Panel.add(addTeam2Points14);
		addPoints15Panel.add(addTeam2Points15);

		addPoints21Panel.add(addTeam2Points21);
		addPoints22Panel.add(addTeam2Points22);
		addPoints23Panel.add(addTeam2Points23);
		addPoints24Panel.add(addTeam2Points24);
		addPoints25Panel.add(addTeam2Points25);

		addPoints31Panel.add(addTeam2Points31);
		addPoints32Panel.add(addTeam2Points32);
		addPoints33Panel.add(addTeam2Points33);
		addPoints34Panel.add(addTeam2Points34);
		addPoints35Panel.add(addTeam2Points35);

		addPoints41Panel.add(addTeam2Points41);
		addPoints42Panel.add(addTeam2Points42);
		addPoints43Panel.add(addTeam2Points43);
		addPoints44Panel.add(addTeam2Points44);
		addPoints45Panel.add(addTeam2Points45);

		addPoints51Panel.add(addTeam2Points51);
		addPoints52Panel.add(addTeam2Points52);
		addPoints53Panel.add(addTeam2Points53);
		addPoints54Panel.add(addTeam2Points54);
		addPoints55Panel.add(addTeam2Points55);
		
		points11Panel.add(addPoints11Panel, pointsLayout11.SOUTH);
		points12Panel.add(addPoints12Panel, pointsLayout12.SOUTH);
		points13Panel.add(addPoints13Panel, pointsLayout13.SOUTH);
		points14Panel.add(addPoints14Panel, pointsLayout14.SOUTH);
		points15Panel.add(addPoints15Panel, pointsLayout15.SOUTH);

		points21Panel.add(addPoints21Panel, pointsLayout21.SOUTH);
		points22Panel.add(addPoints22Panel, pointsLayout22.SOUTH);
		points23Panel.add(addPoints23Panel, pointsLayout23.SOUTH);
		points24Panel.add(addPoints24Panel, pointsLayout24.SOUTH);
		points25Panel.add(addPoints25Panel, pointsLayout25.SOUTH);

		points31Panel.add(addPoints31Panel, pointsLayout31.SOUTH);
		points32Panel.add(addPoints32Panel, pointsLayout32.SOUTH);
		points33Panel.add(addPoints33Panel, pointsLayout33.SOUTH);
		points34Panel.add(addPoints34Panel, pointsLayout34.SOUTH);
		points35Panel.add(addPoints35Panel, pointsLayout35.SOUTH);

		points41Panel.add(addPoints41Panel, pointsLayout41.SOUTH);
		points42Panel.add(addPoints42Panel, pointsLayout42.SOUTH);
		points43Panel.add(addPoints43Panel, pointsLayout43.SOUTH);
		points44Panel.add(addPoints44Panel, pointsLayout44.SOUTH);
		points45Panel.add(addPoints45Panel, pointsLayout45.SOUTH);

		points51Panel.add(addPoints51Panel, pointsLayout51.SOUTH);
		points52Panel.add(addPoints52Panel, pointsLayout52.SOUTH);
		points53Panel.add(addPoints53Panel, pointsLayout53.SOUTH);
		points54Panel.add(addPoints54Panel, pointsLayout54.SOUTH);
		points55Panel.add(addPoints55Panel, pointsLayout55.SOUTH);
		
		points11Panel.add(question11);
		points12Panel.add(question12);
		points13Panel.add(question13);
		points14Panel.add(question14);
		points15Panel.add(question15);

		points21Panel.add(question21);
		points22Panel.add(question22);
		points23Panel.add(question23);
		points24Panel.add(question24);
		points25Panel.add(question25);

		points31Panel.add(question31);
		points32Panel.add(question32);
		points33Panel.add(question33);
		points34Panel.add(question34);
		points35Panel.add(question35);

		points41Panel.add(question41);
		points42Panel.add(question42);
		points43Panel.add(question43);
		points44Panel.add(question44);
		points45Panel.add(question45);

		points51Panel.add(question51);
		points52Panel.add(question52);
		points53Panel.add(question53);
		points54Panel.add(question54);
		points55Panel.add(question55);
		
		points11B.setContentAreaFilled(false);
		points12B.setContentAreaFilled(false);
		points13B.setContentAreaFilled(false);
		points14B.setContentAreaFilled(false);
		points15B.setContentAreaFilled(false);

		points21B.setContentAreaFilled(false);
		points22B.setContentAreaFilled(false);
		points23B.setContentAreaFilled(false);
		points24B.setContentAreaFilled(false);
		points25B.setContentAreaFilled(false);

		points31B.setContentAreaFilled(false);
		points32B.setContentAreaFilled(false);
		points33B.setContentAreaFilled(false);
		points34B.setContentAreaFilled(false);
		points35B.setContentAreaFilled(false);

		points41B.setContentAreaFilled(false);
		points42B.setContentAreaFilled(false);
		points43B.setContentAreaFilled(false);
		points44B.setContentAreaFilled(false);
		points45B.setContentAreaFilled(false);

		points51B.setContentAreaFilled(false);
		points52B.setContentAreaFilled(false);
		points53B.setContentAreaFilled(false);
		points54B.setContentAreaFilled(false);
		points55B.setContentAreaFilled(false);
		
		apply.setContentAreaFilled(false);
		settingsB.setContentAreaFilled(false);

		addTeam1Points11.setContentAreaFilled(false);
		addTeam1Points12.setContentAreaFilled(false);
		addTeam1Points13.setContentAreaFilled(false);
		addTeam1Points14.setContentAreaFilled(false);
		addTeam1Points15.setContentAreaFilled(false);

		addTeam1Points21.setContentAreaFilled(false);
		addTeam1Points22.setContentAreaFilled(false);
		addTeam1Points23.setContentAreaFilled(false);
		addTeam1Points24.setContentAreaFilled(false);
		addTeam1Points25.setContentAreaFilled(false);

		addTeam1Points31.setContentAreaFilled(false);
		addTeam1Points32.setContentAreaFilled(false);
		addTeam1Points33.setContentAreaFilled(false);
		addTeam1Points34.setContentAreaFilled(false);
		addTeam1Points35.setContentAreaFilled(false);

		addTeam1Points41.setContentAreaFilled(false);
		addTeam1Points42.setContentAreaFilled(false);
		addTeam1Points43.setContentAreaFilled(false);
		addTeam1Points44.setContentAreaFilled(false);
		addTeam1Points45.setContentAreaFilled(false);

		addTeam1Points51.setContentAreaFilled(false);
		addTeam1Points52.setContentAreaFilled(false);
		addTeam1Points53.setContentAreaFilled(false);
		addTeam1Points54.setContentAreaFilled(false);
		addTeam1Points55.setContentAreaFilled(false);
		
		
		addTeam2Points11.setContentAreaFilled(false);
		addTeam2Points12.setContentAreaFilled(false);
		addTeam2Points13.setContentAreaFilled(false);
		addTeam2Points14.setContentAreaFilled(false);
		addTeam2Points15.setContentAreaFilled(false);

		addTeam2Points21.setContentAreaFilled(false);
		addTeam2Points22.setContentAreaFilled(false);
		addTeam2Points23.setContentAreaFilled(false);
		addTeam2Points24.setContentAreaFilled(false);
		addTeam2Points25.setContentAreaFilled(false);

		addTeam2Points31.setContentAreaFilled(false);
		addTeam2Points32.setContentAreaFilled(false);
		addTeam2Points33.setContentAreaFilled(false);
		addTeam2Points34.setContentAreaFilled(false);
		addTeam2Points35.setContentAreaFilled(false);

		addTeam2Points41.setContentAreaFilled(false);
		addTeam2Points42.setContentAreaFilled(false);
		addTeam2Points43.setContentAreaFilled(false);
		addTeam2Points44.setContentAreaFilled(false);
		addTeam2Points45.setContentAreaFilled(false);

		addTeam2Points51.setContentAreaFilled(false);
		addTeam2Points52.setContentAreaFilled(false);
		addTeam2Points53.setContentAreaFilled(false);
		addTeam2Points54.setContentAreaFilled(false);
		addTeam2Points55.setContentAreaFilled(false);
		
		neither11.setContentAreaFilled(false);
		neither12.setContentAreaFilled(false);
		neither13.setContentAreaFilled(false);
		neither14.setContentAreaFilled(false);
		neither15.setContentAreaFilled(false);

		neither21.setContentAreaFilled(false);
		neither22.setContentAreaFilled(false);
		neither23.setContentAreaFilled(false);
		neither24.setContentAreaFilled(false);
		neither25.setContentAreaFilled(false);

		neither31.setContentAreaFilled(false);
		neither32.setContentAreaFilled(false);
		neither33.setContentAreaFilled(false);
		neither34.setContentAreaFilled(false);
		neither35.setContentAreaFilled(false);

		neither41.setContentAreaFilled(false);
		neither42.setContentAreaFilled(false);
		neither43.setContentAreaFilled(false);
		neither44.setContentAreaFilled(false);
		neither45.setContentAreaFilled(false);

		neither51.setContentAreaFilled(false);
		neither52.setContentAreaFilled(false);
		neither53.setContentAreaFilled(false);
		neither54.setContentAreaFilled(false);
		neither55.setContentAreaFilled(false);
		
		cat1.setContentAreaFilled(false);
		cat2.setContentAreaFilled(false);
		cat3.setContentAreaFilled(false);
		cat4.setContentAreaFilled(false);
		cat5.setContentAreaFilled(false);
		
		cat1Done.setContentAreaFilled(false);
		cat2Done.setContentAreaFilled(false);
		cat3Done.setContentAreaFilled(false);
		cat4Done.setContentAreaFilled(false);
		cat5Done.setContentAreaFilled(false);
		
		showAnswer11.setContentAreaFilled(false);
		showAnswer12.setContentAreaFilled(false);
		showAnswer13.setContentAreaFilled(false);
		showAnswer14.setContentAreaFilled(false);
		showAnswer15.setContentAreaFilled(false);

		showAnswer21.setContentAreaFilled(false);
		showAnswer22.setContentAreaFilled(false);
		showAnswer23.setContentAreaFilled(false);
		showAnswer24.setContentAreaFilled(false);
		showAnswer25.setContentAreaFilled(false);

		showAnswer31.setContentAreaFilled(false);
		showAnswer32.setContentAreaFilled(false);
		showAnswer33.setContentAreaFilled(false);
		showAnswer34.setContentAreaFilled(false);
		showAnswer35.setContentAreaFilled(false);

		showAnswer41.setContentAreaFilled(false);
		showAnswer42.setContentAreaFilled(false);
		showAnswer43.setContentAreaFilled(false);
		showAnswer44.setContentAreaFilled(false);
		showAnswer45.setContentAreaFilled(false);

		showAnswer51.setContentAreaFilled(false);
		showAnswer52.setContentAreaFilled(false);
		showAnswer53.setContentAreaFilled(false);
		showAnswer54.setContentAreaFilled(false);
		showAnswer55.setContentAreaFilled(false);
		
		points11B.addActionListener(lForSubmit);
		points12B.addActionListener(lForSubmit);
		points13B.addActionListener(lForSubmit);
		points14B.addActionListener(lForSubmit);
		points15B.addActionListener(lForSubmit);

		points21B.addActionListener(lForSubmit);
		points22B.addActionListener(lForSubmit);
		points23B.addActionListener(lForSubmit);
		points24B.addActionListener(lForSubmit);
		points25B.addActionListener(lForSubmit);

		points31B.addActionListener(lForSubmit);
		points32B.addActionListener(lForSubmit);
		points33B.addActionListener(lForSubmit);
		points34B.addActionListener(lForSubmit);
		points35B.addActionListener(lForSubmit);

		points41B.addActionListener(lForSubmit);
		points42B.addActionListener(lForSubmit);
		points43B.addActionListener(lForSubmit);
		points44B.addActionListener(lForSubmit);
		points45B.addActionListener(lForSubmit);
		
		points51B.addActionListener(lForSubmit);
		points52B.addActionListener(lForSubmit);
		points53B.addActionListener(lForSubmit);
		points54B.addActionListener(lForSubmit);
		points55B.addActionListener(lForSubmit);
		
		settingsB.addActionListener(lForSubmit);
		apply.addActionListener(lForSubmit);

		addTeam1Points11.addActionListener(lForSubmit);
		addTeam1Points12.addActionListener(lForSubmit);
		addTeam1Points13.addActionListener(lForSubmit);
		addTeam1Points14.addActionListener(lForSubmit);
		addTeam1Points15.addActionListener(lForSubmit);

		addTeam1Points21.addActionListener(lForSubmit);
		addTeam1Points22.addActionListener(lForSubmit);
		addTeam1Points23.addActionListener(lForSubmit);
		addTeam1Points24.addActionListener(lForSubmit);
		addTeam1Points25.addActionListener(lForSubmit);

		addTeam1Points31.addActionListener(lForSubmit);
		addTeam1Points32.addActionListener(lForSubmit);
		addTeam1Points33.addActionListener(lForSubmit);
		addTeam1Points34.addActionListener(lForSubmit);
		addTeam1Points35.addActionListener(lForSubmit);

		addTeam1Points41.addActionListener(lForSubmit);
		addTeam1Points42.addActionListener(lForSubmit);
		addTeam1Points43.addActionListener(lForSubmit);
		addTeam1Points44.addActionListener(lForSubmit);
		addTeam1Points45.addActionListener(lForSubmit);

		addTeam1Points51.addActionListener(lForSubmit);
		addTeam1Points52.addActionListener(lForSubmit);
		addTeam1Points53.addActionListener(lForSubmit);
		addTeam1Points54.addActionListener(lForSubmit);
		addTeam1Points55.addActionListener(lForSubmit);
		
		addTeam2Points11.addActionListener(lForSubmit);
		addTeam2Points12.addActionListener(lForSubmit);
		addTeam2Points13.addActionListener(lForSubmit);
		addTeam2Points14.addActionListener(lForSubmit);
		addTeam2Points15.addActionListener(lForSubmit);
		
		addTeam2Points21.addActionListener(lForSubmit);
		addTeam2Points22.addActionListener(lForSubmit);
		addTeam2Points23.addActionListener(lForSubmit);
		addTeam2Points24.addActionListener(lForSubmit);
		addTeam2Points25.addActionListener(lForSubmit);
		
		addTeam2Points31.addActionListener(lForSubmit);
		addTeam2Points32.addActionListener(lForSubmit);
		addTeam2Points33.addActionListener(lForSubmit);
		addTeam2Points34.addActionListener(lForSubmit);
		addTeam2Points35.addActionListener(lForSubmit);
		
		addTeam2Points41.addActionListener(lForSubmit);
		addTeam2Points42.addActionListener(lForSubmit);
		addTeam2Points43.addActionListener(lForSubmit);
		addTeam2Points44.addActionListener(lForSubmit);
		addTeam2Points45.addActionListener(lForSubmit);
		
		addTeam2Points51.addActionListener(lForSubmit);
		addTeam2Points52.addActionListener(lForSubmit);
		addTeam2Points53.addActionListener(lForSubmit);
		addTeam2Points54.addActionListener(lForSubmit);
		addTeam2Points55.addActionListener(lForSubmit);
		
		neither11.addActionListener(lForSubmit);
		neither12.addActionListener(lForSubmit);
		neither13.addActionListener(lForSubmit);
		neither14.addActionListener(lForSubmit);
		neither15.addActionListener(lForSubmit);

		neither21.addActionListener(lForSubmit);
		neither22.addActionListener(lForSubmit);
		neither23.addActionListener(lForSubmit);
		neither24.addActionListener(lForSubmit);
		neither25.addActionListener(lForSubmit);

		neither31.addActionListener(lForSubmit);
		neither32.addActionListener(lForSubmit);
		neither33.addActionListener(lForSubmit);
		neither34.addActionListener(lForSubmit);
		neither35.addActionListener(lForSubmit);

		neither41.addActionListener(lForSubmit);
		neither42.addActionListener(lForSubmit);
		neither43.addActionListener(lForSubmit);
		neither44.addActionListener(lForSubmit);
		neither45.addActionListener(lForSubmit);

		neither51.addActionListener(lForSubmit);
		neither52.addActionListener(lForSubmit);
		neither53.addActionListener(lForSubmit);
		neither54.addActionListener(lForSubmit);
		neither55.addActionListener(lForSubmit);

		cat1.addActionListener(lForSubmit);
		cat2.addActionListener(lForSubmit);
		cat3.addActionListener(lForSubmit);
		cat4.addActionListener(lForSubmit);
		cat5.addActionListener(lForSubmit);
		
		cat1Done.addActionListener(lForSubmit);
		cat2Done.addActionListener(lForSubmit);
		cat3Done.addActionListener(lForSubmit);
		cat4Done.addActionListener(lForSubmit);
		cat5Done.addActionListener(lForSubmit);
		
		showAnswer11.addActionListener(lForSubmit);
		showAnswer12.addActionListener(lForSubmit);
		showAnswer13.addActionListener(lForSubmit);
		showAnswer14.addActionListener(lForSubmit);
		showAnswer15.addActionListener(lForSubmit);

		showAnswer21.addActionListener(lForSubmit);
		showAnswer22.addActionListener(lForSubmit);
		showAnswer23.addActionListener(lForSubmit);
		showAnswer24.addActionListener(lForSubmit);
		showAnswer25.addActionListener(lForSubmit);

		showAnswer31.addActionListener(lForSubmit);
		showAnswer32.addActionListener(lForSubmit);
		showAnswer33.addActionListener(lForSubmit);
		showAnswer34.addActionListener(lForSubmit);
		showAnswer35.addActionListener(lForSubmit);

		showAnswer41.addActionListener(lForSubmit);
		showAnswer42.addActionListener(lForSubmit);
		showAnswer43.addActionListener(lForSubmit);
		showAnswer44.addActionListener(lForSubmit);
		showAnswer45.addActionListener(lForSubmit);

		showAnswer51.addActionListener(lForSubmit);
		showAnswer52.addActionListener(lForSubmit);
		showAnswer53.addActionListener(lForSubmit);
		showAnswer54.addActionListener(lForSubmit);
		showAnswer55.addActionListener(lForSubmit);
	}
	
	public static void defaultSetData()
	{
		points11B.setText("100");
		points12B.setText("100");
		points13B.setText("100");
		points14B.setText("100");
		points15B.setText("100");

		points21B.setText("200");
		points22B.setText("200");
		points23B.setText("200");
		points24B.setText("200");
		points25B.setText("200");

		points31B.setText("300");
		points32B.setText("300");
		points33B.setText("300");
		points34B.setText("300");
		points35B.setText("300");

		points41B.setText("400");
		points42B.setText("400");
		points43B.setText("400");
		points44B.setText("400");
		points45B.setText("400");

		points51B.setText("500");
		points52B.setText("500");
		points53B.setText("500");
		points54B.setText("500");
		points55B.setText("500");
	}
	
	public static void getPrevLocation()
	{
		try
		{
			File file = new File(FilesLocation + "\\PrevLocation");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			/*try
			{
				Files
			}
			catch(IOException e2)
			{
				
			}*/
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void setQuestions()
	{
		
		try
		{
			File file = new File(FilesLocation + "\\Questions");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String[][] questions = new String[5][5];
			
			try
			{
				String all;
				
				for(int i = 0; i < 5; i++)
				{
					all = br.readLine();
					
					for(int j = 0; j < 5; j++)
					{
						if(all.contains("\\"))
						{
							questions[j][i] = all.substring(0, all.indexOf('\\'));
							all = all.substring(all.indexOf('\\') + 1);
						}
					}
				}
				
				question11.setText(questions[0][0]);
				question12.setText(questions[0][1]);
				question13.setText(questions[0][2]);
				question14.setText(questions[0][3]);
				question15.setText(questions[0][4]);
				
				question21.setText(questions[1][0]);
				question22.setText(questions[1][1]);
				question23.setText(questions[1][2]);
				question24.setText(questions[1][3]);
				question25.setText(questions[1][4]);

				question31.setText(questions[2][0]);
				question32.setText(questions[2][1]);
				question33.setText(questions[2][2]);
				question34.setText(questions[2][3]);
				question35.setText(questions[2][4]);

				question41.setText(questions[3][0]);
				question42.setText(questions[3][1]);
				question43.setText(questions[3][2]);
				question44.setText(questions[3][3]);
				question45.setText(questions[3][4]);

				question51.setText(questions[4][0]);
				question52.setText(questions[4][1]);
				question53.setText(questions[4][2]);
				question54.setText(questions[4][3]);
				question55.setText(questions[4][4]);
				
			}
			catch(IOException e2)
			{
				
			}
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void setAnswers()
	{
		try
		{
			File file = new File(FilesLocation + "\\Answers");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String answersString;
			try
			{
				
				for(int i = 0; i < 5; i++)
				{
					answersString = br.readLine();
					
					for(int j = 0; j < 5; j++)
					{
						if(answersString.contains("\\"))
						{
							answers[j][i] = answersString.substring(0, answersString.indexOf('\\'));
							answersString = answersString.substring(answersString.indexOf('\\') + 1);
						}
					}
				}
				
				answer11.setText(answers[0][0]);
				answer12.setText(answers[0][1]);
				answer13.setText(answers[0][2]);
				answer14.setText(answers[0][3]);
				answer15.setText(answers[0][4]);

				answer21.setText(answers[1][0]);
				answer22.setText(answers[1][1]);
				answer23.setText(answers[1][2]);
				answer24.setText(answers[1][3]);
				answer25.setText(answers[1][4]);

				answer31.setText(answers[2][0]);
				answer32.setText(answers[2][1]);
				answer33.setText(answers[2][2]);
				answer34.setText(answers[2][3]);
				answer35.setText(answers[2][4]);

				answer41.setText(answers[3][0]);
				answer42.setText(answers[3][1]);
				answer43.setText(answers[3][2]);
				answer44.setText(answers[3][3]);
				answer45.setText(answers[3][4]);

				answer51.setText(answers[4][0]);
				answer52.setText(answers[4][1]);
				answer53.setText(answers[4][2]);
				answer54.setText(answers[4][3]);
				answer55.setText(answers[4][4]);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void setFont()
	{
		Font questions = new Font("Sans-Serif", Font.BOLD, 35);
		
		question11.setFont(questions);
		question12.setFont(questions);
		question13.setFont(questions);
		question14.setFont(questions);
		question15.setFont(questions);

		question21.setFont(questions);
		question22.setFont(questions);
		question23.setFont(questions);
		question24.setFont(questions);
		question25.setFont(questions);

		question31.setFont(questions);
		question32.setFont(questions);
		question33.setFont(questions);
		question34.setFont(questions);
		question35.setFont(questions);

		question41.setFont(questions);
		question42.setFont(questions);
		question43.setFont(questions);
		question44.setFont(questions);
		question45.setFont(questions);

		question51.setFont(questions);
		question52.setFont(questions);
		question53.setFont(questions);
		question54.setFont(questions);
		question55.setFont(questions);
		
		answer11.setFont(questions);
		answer12.setFont(questions);
		answer13.setFont(questions);
		answer14.setFont(questions);
		answer15.setFont(questions);

		answer21.setFont(questions);
		answer22.setFont(questions);
		answer23.setFont(questions);
		answer24.setFont(questions);
		answer25.setFont(questions);

		answer31.setFont(questions);
		answer32.setFont(questions);
		answer33.setFont(questions);
		answer34.setFont(questions);
		answer35.setFont(questions);

		answer41.setFont(questions);
		answer42.setFont(questions);
		answer43.setFont(questions);
		answer44.setFont(questions);
		answer45.setFont(questions);

		answer51.setFont(questions);
		answer52.setFont(questions);
		answer53.setFont(questions);
		answer54.setFont(questions);
		answer55.setFont(questions);
	}
	
	public class ListenForSubmit implements ActionListener
	{
		boolean cat1Check = false;
		boolean cat2Check = false;
		boolean cat3Check = false;
		boolean cat4Check = false;
		boolean cat5Check = false;
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == settingsB)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(settingsMainPanel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
			}
			else if(e.getSource() == apply)
			{
				FilesLocation = FilesLocationTF.getText();
				
				try
				{
					File file = new File(FilesLocation + "\\PrevLocation");
					BufferedWriter writer = new BufferedWriter(new FileWriter(file));
					
					writer.write(FilesLocation);
					writer.close();
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
				
				
				setQuestions();
				setAnswers();
				
				mainFrame.remove(settingsMainPanel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			
			
			
			/////////////////////////////////////////////////////////////////////
			else if(e.getSource() == points11B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points11Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points11B.setText("");
			}
			else if(e.getSource() == points12B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points12Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points12B.setText("");
			}
			else if(e.getSource() == points13B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points13Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points13B.setText("");
			}
			else if(e.getSource() == points14B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points14Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points14B.setText("");
			}
			else if(e.getSource() == points15B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points15Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points15B.setText("");
			}
			

			
			else if(e.getSource() == points21B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points21Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points21B.setText("");
			}
			else if(e.getSource() == points22B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points22Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points22B.setText("");
			}
			else if(e.getSource() == points23B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points23Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points23B.setText("");
			}
			else if(e.getSource() == points24B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points24Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points24B.setText("");
			}
			else if(e.getSource() == points25B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points25Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points25B.setText("");
			}
			
			

			else if(e.getSource() == points31B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points31Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points31B.setText("");
			}
			else if(e.getSource() == points32B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points32Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points32B.setText("");
			}
			else if(e.getSource() == points33B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points33Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points33B.setText("");
			}
			else if(e.getSource() == points34B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points34Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points34B.setText("");
			}
			else if(e.getSource() == points35B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points35Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points35B.setText("");
			}
			
			

			else if(e.getSource() == points41B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points41Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points41B.setText("");
			}
			else if(e.getSource() == points42B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points42Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points42B.setText("");
			}
			else if(e.getSource() == points43B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points43Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points43B.setText("");
			}
			else if(e.getSource() == points44B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points44Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points44B.setText("");
			}
			else if(e.getSource() == points45B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points45Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points45B.setText("");
			}
			
			

			else if(e.getSource() == points51B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points51Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points51B.setText("");
			}
			else if(e.getSource() == points52B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points52Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points52B.setText("");
			}
			else if(e.getSource() == points53B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points53Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points53B.setText("");
			}
			else if(e.getSource() == points54B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points54Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points54B.setText("");
			}
			else if(e.getSource() == points55B)
			{
				mainFrame.remove(mainPanel);
				mainFrame.add(points55Panel);
				mainFrame.repaint();
				mainFrame.setVisible(true);
				
				points55B.setText("");
			}
			
			
			//////////////////////////////////////////////
			else if(e.getSource() == addTeam1Points11)
			{
				team1PointsI += 100;
				mainFrame.remove(points11Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points12)
			{
				team1PointsI += 100;
				mainFrame.remove(points12Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points13)
			{
				team1PointsI += 100;
				mainFrame.remove(points13Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points14)
			{
				team1PointsI += 100;
				mainFrame.remove(points14Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points15)
			{
				team1PointsI += 100;
				mainFrame.remove(points15Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			
			

			else if(e.getSource() == addTeam1Points21)
			{
				team1PointsI += 200;
				mainFrame.remove(points21Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points22)
			{
				team1PointsI += 200;
				mainFrame.remove(points22Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points23)
			{
				team1PointsI += 200;
				mainFrame.remove(points23Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points24)
			{
				team1PointsI += 200;
				mainFrame.remove(points24Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points25)
			{
				team1PointsI += 200;
				mainFrame.remove(points25Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			
			

			else if(e.getSource() == addTeam1Points31)
			{
				team1PointsI += 300;
				mainFrame.remove(points31Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points32)
			{
				team1PointsI += 300;
				mainFrame.remove(points32Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points33)
			{
				team1PointsI += 300;
				mainFrame.remove(points33Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points34)
			{
				team1PointsI += 300;
				mainFrame.remove(points34Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points35)
			{
				team1PointsI += 300;
				mainFrame.remove(points35Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			
			

			else if(e.getSource() == addTeam1Points41)
			{
				team1PointsI += 400;
				mainFrame.remove(points41Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points42)
			{
				team1PointsI += 400;
				mainFrame.remove(points42Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points43)
			{
				team1PointsI += 400;
				mainFrame.remove(points43Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points44)
			{
				team1PointsI += 400;
				mainFrame.remove(points44Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points45)
			{
				team1PointsI += 400;
				mainFrame.remove(points45Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			
			

			else if(e.getSource() == addTeam1Points51)
			{
				team1PointsI += 500;
				mainFrame.remove(points51Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points52)
			{
				team1PointsI += 500;
				mainFrame.remove(points52Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points53)
			{
				team1PointsI += 500;
				mainFrame.remove(points53Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points54)
			{
				team1PointsI += 500;
				mainFrame.remove(points54Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			else if(e.getSource() == addTeam1Points55)
			{
				team1PointsI += 500;
				mainFrame.remove(points55Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team1PointsL.setText(Integer.toString(team1PointsI));
			}
			
			
			
			else if(e.getSource() == neither11)
			{
				mainFrame.remove(points11Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither12)
			{
				mainFrame.remove(points12Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither13)
			{
				mainFrame.remove(points13Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither14)
			{
				mainFrame.remove(points14Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither15)
			{
				mainFrame.remove(points15Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}

			
			
			else if(e.getSource() == neither21)
			{
				mainFrame.remove(points21Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither22)
			{
				mainFrame.remove(points22Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither23)
			{
				mainFrame.remove(points23Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither24)
			{
				mainFrame.remove(points24Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither25)
			{
				mainFrame.remove(points25Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}

			
			
			else if(e.getSource() == neither31)
			{
				mainFrame.remove(points31Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither32)
			{
				mainFrame.remove(points32Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither33)
			{
				mainFrame.remove(points33Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither34)
			{
				mainFrame.remove(points34Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither35)
			{
				mainFrame.remove(points35Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}

			
			
			else if(e.getSource() == neither41)
			{
				mainFrame.remove(points41Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither42)
			{
				mainFrame.remove(points42Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither43)
			{
				mainFrame.remove(points43Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither44)
			{
				mainFrame.remove(points44Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither45)
			{
				mainFrame.remove(neither45);
				mainFrame.add(points45Panel);
				mainFrame.repaint();
			}

			
			
			else if(e.getSource() == neither51)
			{
				mainFrame.remove(points51Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither52)
			{
				mainFrame.remove(points52Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither53)
			{
				mainFrame.remove(points53Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither54)
			{
				mainFrame.remove(points54Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			else if(e.getSource() == neither55)
			{
				mainFrame.remove(points55Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
			}
			
			
			
			else if(e.getSource() == addTeam2Points11)
			{
				team2PointsI += 100;
				mainFrame.remove(points11Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points12)
			{
				team2PointsI += 100;
				mainFrame.remove(points12Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points13)
			{
				team2PointsI += 100;
				mainFrame.remove(points13Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points14)
			{
				team2PointsI += 100;
				mainFrame.remove(points14Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points15)
			{
				team2PointsI += 100;
				mainFrame.remove(points15Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			
			

			else if(e.getSource() == addTeam2Points21)
			{
				team2PointsI += 200;
				mainFrame.remove(points21Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points22)
			{
				team2PointsI += 200;
				mainFrame.remove(points22Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points23)
			{
				team2PointsI += 200;
				mainFrame.remove(points23Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points24)
			{
				team2PointsI += 200;
				mainFrame.remove(points24Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points25)
			{
				team2PointsI += 200;
				mainFrame.remove(points25Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			
			

			else if(e.getSource() == addTeam2Points31)
			{
				team2PointsI += 300;
				mainFrame.remove(points31Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points32)
			{
				team2PointsI += 300;
				mainFrame.remove(points32Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points33)
			{
				team2PointsI += 300;
				mainFrame.remove(points33Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points34)
			{
				team2PointsI += 300;
				mainFrame.remove(points34Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points35)
			{
				team2PointsI += 300;
				mainFrame.remove(points35Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			
			

			else if(e.getSource() == addTeam2Points41)
			{
				team2PointsI += 400;
				mainFrame.remove(points41Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points42)
			{
				team2PointsI += 400;
				mainFrame.remove(points42Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points43)
			{
				team2PointsI += 400;
				mainFrame.remove(points43Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points44)
			{
				team2PointsI += 400;
				mainFrame.remove(points44Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points45)
			{
				team2PointsI += 400;
				mainFrame.remove(points45Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			
			

			else if(e.getSource() == addTeam2Points51)
			{
				team2PointsI += 500;
				mainFrame.remove(points51Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points52)
			{
				team2PointsI += 500;
				mainFrame.remove(points52Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points53)
			{
				team2PointsI += 500;
				mainFrame.remove(points53Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points54)
			{
				team2PointsI += 500;
				mainFrame.remove(points54Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			else if(e.getSource() == addTeam2Points55)
			{
				team2PointsI += 500;
				mainFrame.remove(points55Panel);
				mainFrame.add(mainPanel);
				mainFrame.repaint();
				
				team2PointsL.setText(Integer.toString(team2PointsI));
			}
			
			
			/////////////////////////////////////////////////////////////////////
			else if(e.getSource() == cat1 && !cat2Check && !cat3Check && !cat4Check && !cat5Check)
			{
				cat1Check = true;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1Panel);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat1Panel.add(cat1TF, cat1Layout.CENTER);
				cat1Panel.add(cat1Done, cat1Layout.SOUTH);
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat2 && !cat1Check && !cat3Check && !cat4Check && !cat5Check)
			{
				cat2Check = true;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2Panel);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat2Panel.add(cat2TF, cat2Layout.CENTER);
				cat2Panel.add(cat2Done, cat2Layout.SOUTH);
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat3 && !cat1Check && !cat2Check && !cat4Check && !cat5Check)
			{
				cat3Check = true;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3Panel);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat3Panel.add(cat3TF, cat3Layout.CENTER);
				cat3Panel.add(cat3Done, cat3Layout.SOUTH);
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat4 && !cat1Check && !cat2Check && !cat3Check && !cat5Check)
			{
				cat5Check = true;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4Panel);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat4Panel.add(cat4TF, cat4Layout.CENTER);
				cat4Panel.add(cat4Done, cat4Layout.SOUTH);
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat5 && !cat1Check && !cat2Check && !cat3Check && !cat4Check)
			{
				cat5Check = true;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5Panel);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat5Panel.add(cat5TF, cat5Layout.CENTER);
				cat5Panel.add(cat5Done, cat5Layout.SOUTH);
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat1Done)
			{
				cat1Check = false;
				
				questionsPanel.remove(cat1Panel);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat1.setText(cat1TF.getText());
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat2Done)
			{
				cat2Check = false;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2Panel);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat2.setText(cat2TF.getText());
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat3Done)
			{
				cat3Check = false;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3Panel);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat3.setText(cat3TF.getText());
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat4Done)
			{
				cat4Check = false;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4Panel);
				questionsPanel.remove(cat5);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat4.setText(cat4TF.getText());
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			else if(e.getSource() == cat5Done)
			{
				cat5Check = false;
				
				questionsPanel.remove(cat1);
				questionsPanel.remove(cat2);
				questionsPanel.remove(cat3);
				questionsPanel.remove(cat4);
				questionsPanel.remove(cat5Panel);

				questionsPanel.remove(points11B);
				questionsPanel.remove(points12B);
				questionsPanel.remove(points13B);
				questionsPanel.remove(points14B);
				questionsPanel.remove(points15B);

				questionsPanel.remove(points21B);
				questionsPanel.remove(points22B);
				questionsPanel.remove(points23B);
				questionsPanel.remove(points24B);
				questionsPanel.remove(points25B);

				questionsPanel.remove(points31B);
				questionsPanel.remove(points32B);
				questionsPanel.remove(points33B);
				questionsPanel.remove(points34B);
				questionsPanel.remove(points35B);

				questionsPanel.remove(points41B);
				questionsPanel.remove(points42B);
				questionsPanel.remove(points43B);
				questionsPanel.remove(points44B);
				questionsPanel.remove(points45B);

				questionsPanel.remove(points51B);
				questionsPanel.remove(points52B);
				questionsPanel.remove(points53B);
				questionsPanel.remove(points54B);
				questionsPanel.remove(points55B);
				
				questionsPanel.add(cat1);
				questionsPanel.add(cat2);
				questionsPanel.add(cat3);
				questionsPanel.add(cat4);
				questionsPanel.add(cat5);

				questionsPanel.add(points11B);
				questionsPanel.add(points12B);
				questionsPanel.add(points13B);
				questionsPanel.add(points14B);
				questionsPanel.add(points15B);

				questionsPanel.add(points21B);
				questionsPanel.add(points22B);
				questionsPanel.add(points23B);
				questionsPanel.add(points24B);
				questionsPanel.add(points25B);

				questionsPanel.add(points31B);
				questionsPanel.add(points32B);
				questionsPanel.add(points33B);
				questionsPanel.add(points34B);
				questionsPanel.add(points35B);

				questionsPanel.add(points41B);
				questionsPanel.add(points42B);
				questionsPanel.add(points43B);
				questionsPanel.add(points44B);
				questionsPanel.add(points45B);

				questionsPanel.add(points51B);
				questionsPanel.add(points52B);
				questionsPanel.add(points53B);
				questionsPanel.add(points54B);
				questionsPanel.add(points55B);
				
				cat5.setText(cat5TF.getText());
				
				mainFrame.repaint();
				mainFrame.validate();
			}
			
			
			//////////////////////////////////////////////////////////////////////////////
			
			
			else if(e.getSource() == showAnswer11)
			{
				addPoints11Panel.remove(addTeam1Points11);
				addPoints11Panel.remove(showAnswer11);
				addPoints11Panel.remove(addTeam2Points11);
				addPoints11Panel.add(addTeam1Points11);
				addPoints11Panel.add(neither11);
				addPoints11Panel.add(addTeam2Points11);
				
				points11Panel.remove(question11);
				points11Panel.add(answer11);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer12)
			{
				addPoints12Panel.remove(addTeam1Points12);
				addPoints12Panel.remove(showAnswer12);
				addPoints12Panel.remove(addTeam2Points12);
				addPoints12Panel.add(addTeam1Points12);
				addPoints12Panel.add(neither12);
				addPoints12Panel.add(addTeam2Points12);
				
				points12Panel.remove(question12);
				points12Panel.add(answer12);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer13)
			{
				addPoints13Panel.remove(addTeam1Points13);
				addPoints13Panel.remove(showAnswer13);
				addPoints13Panel.remove(addTeam2Points13);
				addPoints13Panel.add(addTeam1Points13);
				addPoints13Panel.add(neither13);
				addPoints13Panel.add(addTeam2Points13);
				
				points13Panel.remove(question13);
				points13Panel.add(answer13);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer14)
			{
				addPoints14Panel.remove(addTeam1Points14);
				addPoints14Panel.remove(showAnswer14);
				addPoints14Panel.remove(addTeam2Points14);
				addPoints14Panel.add(addTeam1Points14);
				addPoints14Panel.add(neither14);
				addPoints14Panel.add(addTeam2Points14);
				
				points14Panel.remove(question14);
				points14Panel.add(answer14);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer15)
			{
				addPoints15Panel.remove(addTeam1Points15);
				addPoints15Panel.remove(showAnswer15);
				addPoints15Panel.remove(addTeam2Points15);
				addPoints15Panel.add(addTeam1Points15);
				addPoints15Panel.add(neither15);
				addPoints15Panel.add(addTeam2Points15);
				
				points15Panel.remove(question15);
				points15Panel.add(answer15);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			
			
			else if(e.getSource() == showAnswer21)
			{
				addPoints21Panel.remove(addTeam1Points21);
				addPoints21Panel.remove(showAnswer21);
				addPoints21Panel.remove(addTeam2Points21);
				addPoints21Panel.add(addTeam1Points21);
				addPoints21Panel.add(neither21);
				addPoints21Panel.add(addTeam2Points21);
				
				points21Panel.remove(question21);
				points21Panel.add(answer21);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer22)
			{
				addPoints22Panel.remove(addTeam1Points22);
				addPoints22Panel.remove(showAnswer22);
				addPoints22Panel.remove(addTeam2Points22);
				addPoints22Panel.add(addTeam1Points22);
				addPoints22Panel.add(neither22);
				addPoints22Panel.add(addTeam2Points22);
				
				points22Panel.remove(question22);
				points22Panel.add(answer22);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer23)
			{
				addPoints23Panel.remove(addTeam1Points23);
				addPoints23Panel.remove(showAnswer23);
				addPoints23Panel.remove(addTeam2Points23);
				addPoints23Panel.add(addTeam1Points23);
				addPoints23Panel.add(neither23);
				addPoints23Panel.add(addTeam2Points23);
				
				points23Panel.remove(question23);
				points23Panel.add(answer23);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer24)
			{
				addPoints24Panel.remove(addTeam1Points24);
				addPoints24Panel.remove(showAnswer24);
				addPoints24Panel.remove(addTeam2Points24);
				addPoints24Panel.add(addTeam1Points24);
				addPoints24Panel.add(neither24);
				addPoints24Panel.add(addTeam2Points24);
				
				points24Panel.remove(question24);
				points24Panel.add(answer24);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer25)
			{
				addPoints25Panel.remove(addTeam1Points25);
				addPoints25Panel.remove(showAnswer25);
				addPoints25Panel.remove(addTeam2Points25);
				addPoints25Panel.add(addTeam1Points25);
				addPoints25Panel.add(neither25);
				addPoints25Panel.add(addTeam2Points25);
				
				points25Panel.remove(question25);
				points25Panel.add(answer25);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			
			
			else if(e.getSource() == showAnswer31)
			{
				addPoints31Panel.remove(addTeam1Points31);
				addPoints31Panel.remove(showAnswer31);
				addPoints31Panel.remove(addTeam2Points31);
				addPoints31Panel.add(addTeam1Points31);
				addPoints31Panel.add(neither31);
				addPoints31Panel.add(addTeam2Points31);
				
				points31Panel.remove(question31);
				points31Panel.add(answer31);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer32)
			{
				addPoints32Panel.remove(addTeam1Points32);
				addPoints32Panel.remove(showAnswer32);
				addPoints32Panel.remove(addTeam2Points32);
				addPoints32Panel.add(addTeam1Points32);
				addPoints32Panel.add(neither32);
				addPoints32Panel.add(addTeam2Points32);
				
				points32Panel.remove(question32);
				points32Panel.add(answer32);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer33)
			{
				addPoints33Panel.remove(addTeam1Points33);
				addPoints33Panel.remove(showAnswer33);
				addPoints33Panel.remove(addTeam2Points33);
				addPoints33Panel.add(addTeam1Points33);
				addPoints33Panel.add(neither33);
				addPoints33Panel.add(addTeam2Points33);
				
				points33Panel.remove(question33);
				points33Panel.add(answer33);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer34)
			{
				addPoints34Panel.remove(addTeam1Points34);
				addPoints34Panel.remove(showAnswer34);
				addPoints34Panel.remove(addTeam2Points34);
				addPoints34Panel.add(addTeam1Points34);
				addPoints34Panel.add(neither34);
				addPoints34Panel.add(addTeam2Points34);
				
				points34Panel.remove(question34);
				points34Panel.add(answer34);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer35)
			{
				addPoints35Panel.remove(addTeam1Points35);
				addPoints35Panel.remove(showAnswer35);
				addPoints35Panel.remove(addTeam2Points35);
				addPoints35Panel.add(addTeam1Points35);
				addPoints35Panel.add(neither35);
				addPoints35Panel.add(addTeam2Points35);
				
				points35Panel.remove(question35);
				points35Panel.add(answer35);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			
			
			else if(e.getSource() == showAnswer41)
			{
				addPoints41Panel.remove(addTeam1Points41);
				addPoints41Panel.remove(showAnswer41);
				addPoints41Panel.remove(addTeam2Points41);
				addPoints41Panel.add(addTeam1Points41);
				addPoints41Panel.add(neither41);
				addPoints41Panel.add(addTeam2Points41);
				
				points41Panel.remove(question41);
				points41Panel.add(answer41);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer42)
			{
				addPoints42Panel.remove(addTeam1Points42);
				addPoints42Panel.remove(showAnswer42);
				addPoints42Panel.remove(addTeam2Points42);
				addPoints42Panel.add(addTeam1Points42);
				addPoints42Panel.add(neither42);
				addPoints42Panel.add(addTeam2Points42);
				
				points42Panel.remove(question42);
				points42Panel.add(answer42);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer43)
			{
				addPoints43Panel.remove(addTeam1Points43);
				addPoints43Panel.remove(showAnswer43);
				addPoints43Panel.remove(addTeam2Points43);
				addPoints43Panel.add(addTeam1Points43);
				addPoints43Panel.add(neither43);
				addPoints43Panel.add(addTeam2Points43);
				
				points43Panel.remove(question43);
				points43Panel.add(answer43);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer44)
			{
				addPoints44Panel.remove(addTeam1Points44);
				addPoints44Panel.remove(showAnswer44);
				addPoints44Panel.remove(addTeam2Points44);
				addPoints44Panel.add(addTeam1Points44);
				addPoints44Panel.add(neither44);
				addPoints44Panel.add(addTeam2Points44);
				
				points44Panel.remove(question44);
				points44Panel.add(answer44);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer45)
			{
				addPoints45Panel.remove(addTeam1Points45);
				addPoints45Panel.remove(showAnswer45);
				addPoints45Panel.remove(addTeam2Points45);
				addPoints45Panel.add(addTeam1Points45);
				addPoints45Panel.add(neither45);
				addPoints45Panel.add(addTeam2Points45);
				
				points45Panel.remove(question45);
				points45Panel.add(answer45);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			
			
			else if(e.getSource() == showAnswer51)
			{
				addPoints51Panel.remove(addTeam1Points51);
				addPoints51Panel.remove(showAnswer51);
				addPoints51Panel.remove(addTeam2Points51);
				addPoints51Panel.add(addTeam1Points51);
				addPoints51Panel.add(neither51);
				addPoints51Panel.add(addTeam2Points51);
				
				points51Panel.remove(question51);
				points51Panel.add(answer51);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer52)
			{
				addPoints52Panel.remove(addTeam1Points52);
				addPoints52Panel.remove(showAnswer52);
				addPoints52Panel.remove(addTeam2Points52);
				addPoints52Panel.add(addTeam1Points52);
				addPoints52Panel.add(neither52);
				addPoints52Panel.add(addTeam2Points52);
				
				points52Panel.remove(question52);
				points52Panel.add(answer52);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer53)
			{
				addPoints54Panel.remove(addTeam1Points53);
				addPoints54Panel.remove(showAnswer53);
				addPoints54Panel.remove(addTeam2Points53);
				addPoints54Panel.add(addTeam1Points53);
				addPoints54Panel.add(neither53);
				addPoints54Panel.add(addTeam2Points53);
				
				points54Panel.remove(question53);
				points54Panel.add(answer53);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer54)
			{
				addPoints54Panel.remove(addTeam1Points54);
				addPoints54Panel.remove(showAnswer54);
				addPoints54Panel.remove(addTeam2Points54);
				addPoints54Panel.add(addTeam1Points54);
				addPoints54Panel.add(neither54);
				addPoints54Panel.add(addTeam2Points54);
				
				points54Panel.remove(question54);
				points54Panel.add(answer54);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
			else if(e.getSource() == showAnswer55)
			{
				addPoints55Panel.remove(addTeam1Points55);
				addPoints55Panel.remove(showAnswer55);
				addPoints55Panel.remove(addTeam2Points55);
				addPoints55Panel.add(addTeam1Points55);
				addPoints55Panel.add(neither55);
				addPoints55Panel.add(addTeam2Points55);
				
				points55Panel.remove(question55);
				points55Panel.add(answer55);
				
				mainFrame.repaint();
				mainFrame.revalidate();
			}
		}
	}
}
