package org.tatasu.gwt.client.chart.treemapchart.options;
/**
 * Класс с параметрами опций для графиков TreemapChart
 * @author HafizovAR
 *
 */
public class TreeMapChartOptions {

	/**
	 * Цвет секции заголовка для каждой ноды, соответствует формату html цветов.
	 * #988f86
	 */
	private String	headerColor				= "#988f86";
	/**
	 * Высота заголовка для каждой ноды в пикселях, может быть равно нулю. По
	 * умолчанию = 0
	 */
	private Integer	headerHeight			= 0;
	/**
	 * Цвет заголовка ноды при наведении мыши. Укажите HTML значение цвета или
	 * null, если нулевые это значение будет headerColor "облегченный" на 35%
	 */
	private String	headerHighlightColor	= null;
	/**
	 * The color for a rectangle with a column 3 value of maxColorValue. Specify
	 * an HTML color value.
	 */
	private String	maxColor				= "#00dd00";
	/**
	 * The maximum number of node levels to show in the current view. Levels
	 * will be flattened into the current plane. If your tree has more levels
	 * than this, you will have to go up or down to see them. You can
	 * additionally see maxPostDepth levels below this as shaded rectangles
	 * within these nodes.
	 */
	private Integer	maxDepth				= 1;
	/**
	 * The highlight color to use for the node with the largest value in column
	 * 3. Specify an HTML color value or null; If null, this value will be the
	 * value of maxColor lightened by 35%
	 */
	private String	maxHighlightColor		= null;
	/**
	 * How many levels of nodes beyond maxDepth to show in "hinted" fashion.
	 * Hinted nodes are shown as shaded rectangles within a node that is within
	 * the maxDepth limit.
	 */
	private Integer	maxPostDepth			= 1;
	/**
	 * The maximum value allowed in column 3. All values greater than this will
	 * be trimmed to this value. If set to null, it will be set to the max value
	 * in the column.
	 */
	private Integer	maxColorValue			= null;
	/**
	 * The color for a rectangle with a column 3 value midway between
	 * maxColorValue and minColorValue. Specify an HTML color value.
	 */
	private String	midColor				= "#000000";
	/**
	 * The highlight color to use for the node with a column 3 value near the
	 * median of minColorValue and maxColorValue. Specify an HTML color value or
	 * null; if null, this value will be the value of midColor lightened by 35%.
	 */
	private String	midHighlightColor		= null;
	/**
	 * The color for a rectangle with the column 3 value of minColorValue.
	 * Specify an HTML color value.
	 */
	private String	minColor				= "#dd0000";
	/**
	 * The highlight color to use for the node with a column 3 value nearest to
	 * minColorValue. Specify an HTML color value or null; if null, this value
	 * will be the value of minColor lightened by 35%
	 */
	private String	minHighlightColor		= null;
	/**
	 * The minimum value allowed in column 3. All values less than this will be
	 * trimmed to this value. If set to null, it will be calculated as the
	 * minimum value in the column.
	 */
	private Integer	minColorValue			= null;
	/**
	 * The color to use for a rectangle when a node has no value for column 3,
	 * and that node is a leaf (or contains only leaves). Specify an HTML color
	 * value.
	 */
	private String	noColor					= "#000000";
	/**
	 * The color to use for a rectangle of "no" color when highlighted. Specify
	 * an HTML color value or null; if null, this will be the value of noColor
	 * lightened by 35%.
	 */
	private String	noHighlightColor		= null;
	/**
	 * Whether or not to show a color gradient scale from minColor to maxColor
	 * along the top of the chart. Specify true to show the scale.
	 */
	private boolean	showScale				= false;
	/** Whether or not to show tooltips. */
	private boolean	showTooltips			= true;
	/** The text color. Specify an HTML color value. */
	private String	fontColor				= "#ffffff";
	/** The font family to use for all text. */
	private String	fontFamily				= "auto";
	/** The font size for all text, in points. */
	private Integer	fontSize				= 12;

	public String getHeaderColor() {
		return headerColor;
	}
	public void setHeaderColor(String headerColor) {
		this.headerColor = headerColor;
	}
	public Integer getHeaderHeight() {
		return headerHeight;
	}
	public void setHeaderHeight(Integer headerHeight) {
		this.headerHeight = headerHeight;
	}
	public String getHeaderHighlightColor() {
		return headerHighlightColor;
	}
	public void setHeaderHighlightColor(String headerHighlightColor) {
		this.headerHighlightColor = headerHighlightColor;
	}
	public String getMaxColor() {
		return maxColor;
	}
	public void setMaxColor(String maxColor) {
		this.maxColor = maxColor;
	}
	public Integer getMaxDepth() {
		return maxDepth;
	}
	public void setMaxDepth(Integer maxDepth) {
		this.maxDepth = maxDepth;
	}
	public String getMaxHighlightColor() {
		return maxHighlightColor;
	}
	public void setMaxHighlightColor(String maxHighlightColor) {
		this.maxHighlightColor = maxHighlightColor;
	}
	public Integer getMaxPostDepth() {
		return maxPostDepth;
	}
	public void setMaxPostDepth(Integer maxPostDepth) {
		this.maxPostDepth = maxPostDepth;
	}
	public Integer getMaxColorValue() {
		return maxColorValue;
	}
	public void setMaxColorValue(Integer maxColorValue) {
		this.maxColorValue = maxColorValue;
	}
	public String getMidColor() {
		return midColor;
	}
	public void setMidColor(String midColor) {
		this.midColor = midColor;
	}
	public String getMidHighlightColor() {
		return midHighlightColor;
	}
	public void setMidHighlightColor(String midHighlightColor) {
		this.midHighlightColor = midHighlightColor;
	}
	public String getMinColor() {
		return minColor;
	}
	public void setMinColor(String minColor) {
		this.minColor = minColor;
	}
	public String getMinHighlightColor() {
		return minHighlightColor;
	}
	public void setMinHighlightColor(String minHighlightColor) {
		this.minHighlightColor = minHighlightColor;
	}
	public Integer getMinColorValue() {
		return minColorValue;
	}
	public void setMinColorValue(Integer minColorValue) {
		this.minColorValue = minColorValue;
	}
	public String getNoColor() {
		return noColor;
	}
	public void setNoColor(String noColor) {
		this.noColor = noColor;
	}
	public String getNoHighlightColor() {
		return noHighlightColor;
	}
	public void setNoHighlightColor(String noHighlightColor) {
		this.noHighlightColor = noHighlightColor;
	}
	public boolean isShowScale() {
		return showScale;
	}
	public void setShowScale(boolean showScale) {
		this.showScale = showScale;
	}
	public boolean isShowTooltips() {
		return showTooltips;
	}
	public void setShowTooltips(boolean showTooltips) {
		this.showTooltips = showTooltips;
	}
	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	public String getFontFamily() {
		return fontFamily;
	}
	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
	}
	public Integer getFontSize() {
		return fontSize;
	}
	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}
}
