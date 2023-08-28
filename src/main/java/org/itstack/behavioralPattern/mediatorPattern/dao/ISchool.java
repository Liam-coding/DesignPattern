package org.itstack.behavioralPattern.mediatorPattern.dao;

import org.itstack.behavioralPattern.mediatorPattern.po.School;

public interface ISchool {
    School querySchoolInfoById(Long treeId);
}
