package student_aleksandrs_korsaks.ak_lesson_10.level_2_3;

class SearchCriteriaDemo {
    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfSearchCriteria = new YearOfIssueSearchCriteria("1890");
        SearchCriteria searchCriteriaOne = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearOfSearchCriteria);
        SearchCriteria searchCriteriaThree = new OrSearchCriteria(authorSearchCriteria, yearOfSearchCriteria);
        SearchCriteria searchCriteriaFour = new OrSearchCriteria(searchCriteriaThree, titleSearchCriteria);
    }
}
