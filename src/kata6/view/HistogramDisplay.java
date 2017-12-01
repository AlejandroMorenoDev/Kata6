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
public class HistogramDisplay <T> extends ApplicationFrame {
    
    private final Histogram<T> histo;
    private final String nameEjeX;
    
    public HistogramDisplay(Histogram histo, String nameEjeX) {
        super("Histograma");
        this.histo = histo;
        this.nameEjeX = nameEjeX;
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
        for (T key : histo.keySet()){
            dataSet.addValue(histo.get(key), "",(Comparable) key);
        }
        
        return dataSet;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma", 
                nameEjeX, 
                "Nº de emails", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                rootPaneCheckingEnabled);

        return chart;
    }
    
}