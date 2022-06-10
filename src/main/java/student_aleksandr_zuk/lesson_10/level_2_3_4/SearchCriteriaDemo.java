package student_aleksandr_zuk.lesson_10.level_2_3_4;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteriaOne = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearCriteria);
        SearchCriteria searchCriteriaThree = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaFour = new OrSearchCriteria(authorSearchCriteria, yearCriteria);
    }
}
