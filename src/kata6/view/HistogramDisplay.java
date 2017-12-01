/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;
import kata6.model.Histogram;
import java.awt.Color;
import org.jfree.ui.ApplicationFrame;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author amct2
 */
public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histo;
    
    public HistogramDisplay(Histogram histo) {
        super("Histograma");
        this.histo = histo;
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histo.keySet()){
            dataSet.addValue(histo.get(key), "", key);
        }
        
        return dataSet;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma", 
                "Dominios", 
                "Nº de emails", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                rootPaneCheckingEnabled);

        return chart;
    }
    
}